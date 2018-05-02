package com.frwan.desgin.structural.composite;

public abstract class Graphics {
    protected String name;

    public Graphics(String name) {
        this.name = name;
    }

    public abstract void draw();
}
