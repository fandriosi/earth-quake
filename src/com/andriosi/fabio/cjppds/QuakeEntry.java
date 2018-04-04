/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.cjppds;

public class QuakeEntry implements Comparable<QuakeEntry> {
    private Location location;
    private String title;
    private double depth;
    private double magnitude;

    public QuakeEntry(double latitude, double longitude, double magnitude, String title, double depth) {
        this.location = new Location(latitude,longitude);
        this.magnitude = magnitude;
	this.title = title;
	this.depth = depth;
    }
	
    public Location getLocation(){
	return this.location;
    }
	
    public double getMagnitude(){
        return this.magnitude;
    }
	
    public String getInfo(){
	return this.title;
    }
	
    public double getDepth(){
	return this.depth;
    }

    @Override
    public int compareTo(QuakeEntry entry) {
	double difflat = this.location.getLatitude() - entry.location.getLatitude();
	if (Math.abs(difflat) < 0.001) {
            double diff = this.location.getLongitude() - entry.location.getLongitude();
            if (diff < 0) return -1;
            if (diff > 0) return 1;
            return 0;
	}
	if (difflat < 0) return -1;
	if (difflat > 0) return 1;
	
		// never reached
	return 0;
    }
	
    @Override
    public String toString(){
        return String.format("(%3.2f, %3.2f), mag = %3.2f, depth = %3.2f, title = %s", this.location.getLatitude(),
                this.location.getLongitude(),this.magnitude,this.depth,this.title);
    }
}
