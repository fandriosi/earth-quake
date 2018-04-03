/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.cjpds.test;

import com.andriosi.fabio.cjppds.ClosestQuakes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcpd2158
 */
public class TesteClosestQuakes {
    
    public TesteClosestQuakes() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TesteClosest() {
         ClosestQuakes cq = new ClosestQuakes();
         String sources ="src/data/nov20quakedata.atom";
         cq.findClosestQuakes(sources);
     }
}
