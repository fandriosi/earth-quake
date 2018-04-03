/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.cjppds;

import java.util.ArrayList;

/**
 *
 * @author rcpd2158
 */
public class ClosestQuakes {
    
    public void findClosestQuakes(String source){
        EarthQuakeParser parser = new EarthQuakeParser();
        ArrayList<QuakeEntry> list = parser.read(source);
        System.out.println("read data for "+ list.size());
        Location jakarta = new Location(-6.211, 106.845);
        ArrayList<QuakeEntry> close = getClosest(list, jakarta, 10);
        for(int k =0; k < close.size(); k++){
            QuakeEntry entry = close.get(k);
            double distanceInMeters = jakarta.distanceTo(entry.getLocation());
            System.out.printf("%4.2f\t,%s\n", distanceInMeters/1000, entry);
        }
        System.out.println("Number found: "+ close.size());
    }

    private ArrayList<QuakeEntry> getClosest(ArrayList<QuakeEntry> quakeData, Location current, int howMany) {
        ArrayList<QuakeEntry> ret= new ArrayList<>();
        ArrayList<QuakeEntry> copy = new ArrayList<>(quakeData);
        for(int j = 0 ; j < howMany; j++){
            int minIndex = 0;
            for(int k = 1; k < copy.size(); k++){
                QuakeEntry quake = copy.get(k);
                Location  loc = quake.getLocation();
                if(loc.distanceTo(current)< copy.get(minIndex).getLocation().distanceTo(current)){
                    minIndex = k;
                }
            }
            ret.add(copy.get(minIndex));
            copy.remove(minIndex);
        }       
        return ret;
    }
}
