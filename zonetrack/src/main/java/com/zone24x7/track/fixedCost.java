package com.zone24x7.track;

public class fixedCost extends basicCosts {
    private final Integer cost;

    fixedCost(String cost){
        this.cost = Integer.parseInt(cost.trim());
    }


    public int getCost() {
        Integer cost = this.cost;
        return cost;
    }

    public String getCostType() {
        return "Fixed Cost";
    }
}
