package com.frwan.desgin.structural.bridge;

public abstract class Brush {
    protected Color color;

    public abstract void paint();

    public void setColor(Color color) {
        this.color = color;
    }
}
