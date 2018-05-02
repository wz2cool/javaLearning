package com.frwan.desgin.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphics {

    protected List<Graphics> pricList = new ArrayList<Graphics>();

    public Picture(String name) {
        super(name);
    }

    public void draw() {
        System.out.println("Draw a " + this.name);
        for (Graphics g :
                this.pricList) {
            g.draw();
        }
    }

    public void add(Graphics g) {
        this.pricList.add(g);
    }

    public void remove(Graphics g) {
        this.pricList.remove(g);
    }
}
