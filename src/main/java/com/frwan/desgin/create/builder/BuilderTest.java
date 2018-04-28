package com.frwan.desgin.create.builder;

public class BuilderTest {

    public static void main(String[] args) {
        FoodManager foodManager = new FoodManager();
        Food food = foodManager.construct(new NormalBuilder());
        food.show();
    }
}
