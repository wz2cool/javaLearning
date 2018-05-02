package com.frwan.desgin.structural.flyweight;

public class CharactorB extends Character {

    public CharactorB() {
        this.symbol = 'B';
        this.height = 100;
        this.width = 140;
        this.ascent = 72;
        this.descent = 0;
    }

    public void display() {
        System.out.println(this.symbol);
    }
}
