package com.frwan.concurrent;

public class NotifyTest {

    public static void testNoitfy() {

    }

    private synchronized void testMethod() {
        System.out.println(Thread.currentThread().getName() + " Start-----");
        try {
            wait(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End-------");
    }
}
