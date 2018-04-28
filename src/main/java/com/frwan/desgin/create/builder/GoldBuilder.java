package com.frwan.desgin.create.builder;

public class GoldBuilder extends Builder {

    private final Food goldFood = new Food();

    public void BuildHamb() {
        this.goldFood.add("GoldHamb", "$ 13.50");
    }

    public void BuildDrink() {
        this.goldFood.add("CokeCole", "$ 4.50");
    }

    public void BuildClip() {
        this.goldFood.add("FireChips", "$ 3.50");
    }

    public Food GetFood() {
        return this.goldFood;
    }
}
