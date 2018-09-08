package com.zone24x7.track;

public class cmdDisplay implements display {
    public void show(String costType, Integer cost){
        System.out.println("Cost for this "+costType+" is "+ Integer.toString(cost));
    }
}
