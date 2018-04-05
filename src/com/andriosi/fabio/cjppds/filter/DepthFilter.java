/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.cjppds.filter;

import java.util.ArrayList;

/**
 *
 * @author rcpd2158
 */
public class DepthFilter implements Filter{
    private final double minDepth;
    private final double maxDepth;
    public DepthFilter(double minDepth, double maxDepth) {
        this.minDepth = minDepth;
        this.maxDepth = maxDepth;
    }
  
    @Override
    public boolean satisfies(QuakeEntry quakeEntry) {
        return (quakeEntry.getDepth() <= this.minDepth 
                && quakeEntry.getDepth() >= this.maxDepth);      
    }
    
}
