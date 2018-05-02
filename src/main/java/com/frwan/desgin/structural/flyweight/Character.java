package com.frwan.desgin.structural.flyweight;

public abstract class Character {
    protected char symbol;
    protected int width;
    protected int height;
    protected int ascent;
    protected int descent;

    public abstract void display();
}
