package com.frwan.desgin.create.builder;

// Director
public class FoodManager {
    public Food construct(Builder builder) {
        builder.BuildClip();
        builder.BuildHamb();
        builder.BuildDrink();
        return builder.GetFood();
    }
}
