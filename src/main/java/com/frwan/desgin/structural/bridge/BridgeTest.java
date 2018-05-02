package com.frwan.desgin.structural.bridge;

// https://blog.csdn.net/angjunqiang/article/details/42061453
public class BridgeTest {
    public static void main(String[] args) {
        BigBrush bigBrush = new BigBrush();
        bigBrush.setColor(new Red());
        bigBrush.paint();

        bigBrush.setColor(new Green());
        bigBrush.paint();
    }
}
