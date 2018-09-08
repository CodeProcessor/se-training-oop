package com.zone24x7.track;

public class variableCost extends basicCosts {
    private final int costPerPersonPerMonth = 30;
    private final int noOfMonths;
    private final int onOfPeople;

    variableCost(String noOfPeople, String noOfMonths){
        this.onOfPeople = Integer.parseInt(noOfPeople.trim());
        this.noOfMonths = Integer.parseInt(noOfMonths.trim());
    }

    public int getCost() {
        Integer totalCost = this.noOfMonths * this.onOfPeople * this.costPerPersonPerMonth;
        return totalCost;
    }

    public String getCostType() {
        return "Variable cost";
    }
}
