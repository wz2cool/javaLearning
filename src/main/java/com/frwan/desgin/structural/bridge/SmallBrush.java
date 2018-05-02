package com.frwan.desgin.structural.bridge;

public class SmallBrush extends Brush {
    public void paint() {
        System.out.println(String.format("Using small brush and color %s painting...", this.color.getColor()));
    }
}
