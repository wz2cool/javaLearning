package com.frwan.desgin.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        BigBrush bigBrush = new BigBrush();
        bigBrush.setColor(new Red());
        bigBrush.paint();

        bigBrush.setColor(new Green());
        bigBrush.paint();
    }
}
