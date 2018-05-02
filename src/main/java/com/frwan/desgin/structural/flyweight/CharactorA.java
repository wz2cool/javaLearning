package com.frwan.desgin.structural.flyweight;

public class CharactorA extends Character {

    public CharactorA() {
        this.symbol = 'A';
        this.height = 100;
        this.width = 120;
        this.ascent = 70;
        this.descent = 0;
    }

    public void display() {
        System.out.println(this.symbol);
    }
}
