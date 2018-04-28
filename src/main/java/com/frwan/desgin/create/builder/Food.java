package com.frwan.desgin.create.builder;

import java.util.HashMap;
import java.util.Map;

public class Food {
    Map<String, String> food = new HashMap<String, String>();

    public void add(String strName, String price) {
        this.food.put(strName, price);
    }

    public void show() {
        System.out.println("Food list");
        System.out.println("--------------------");
        String strFoodList = "";
        for (Map.Entry<String, String> entry : food.entrySet()) {
            strFoodList = strFoodList + "\n" + entry.getKey();
            strFoodList = strFoodList + "\n" + entry.getValue();
        }

        System.out.println(strFoodList);
        System.out.println("\n------------------");
    }
}
