/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.cjpds.test;

import com.andriosi.fabio.cjppds.ClosestQuakes;
import com.andriosi.fabio.cjppds.EarthQuakeClient;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteClosestQuakes {
    private String source = "src/data/nov20quakedata.atom";
    public TesteClosestQuakes() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TesteClosest() {
         ClosestQuakes cq = new ClosestQuakes();        
         cq.findClosestQuakes(source);
     }
    
}
