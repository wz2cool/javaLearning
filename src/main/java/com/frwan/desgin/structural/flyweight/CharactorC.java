package com.frwan.desgin.structural.flyweight;

public class CharactorC extends Character {

    public CharactorC() {
        this.symbol = 'C';
        this.height = 100;
        this.width = 160;
        this.ascent = 74;
        this.descent = 0;
    }

    public void display() {
        System.out.println(this.symbol);
    }
}
