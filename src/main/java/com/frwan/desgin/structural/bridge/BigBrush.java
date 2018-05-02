package com.frwan.desgin.structural.bridge;

public class BigBrush extends Brush {
    public void paint() {
        System.out.println(String.format("Using big brush and color %s painting...", this.color.getColor()));
    }
}
