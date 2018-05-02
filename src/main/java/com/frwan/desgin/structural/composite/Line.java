package com.frwan.desgin.structural.composite;

public class Line extends Graphics {
    public Line(String name) {
        super(name);
    }

    public void draw() {
        System.out.println("Draw a" + this.name);
    }
}
