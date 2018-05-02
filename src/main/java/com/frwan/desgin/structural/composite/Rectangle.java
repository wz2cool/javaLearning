package com.frwan.desgin.structural.composite;

public class Rectangle extends Graphics {
    public Rectangle(String name) {
        super(name);
    }

    public void draw() {
        System.out.println("Draw a" + this.name);
    }
}
