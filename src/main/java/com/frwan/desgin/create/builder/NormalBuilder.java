package com.frwan.desgin.create.builder;

public class NormalBuilder extends Builder {

    private final Food normalFood = new Food();

    public void BuildHamb() {
        this.normalFood.add("NormalHamb", "$ 10.50");
    }

    public void BuildDrink() {
        this.normalFood.add("CokeCode", "$ 4.50");
    }

    public void BuildClip() {
        this.normalFood.add("FireChips", "$ 2.00");
    }

    public Food GetFood() {
        return this.normalFood;
    }
}
