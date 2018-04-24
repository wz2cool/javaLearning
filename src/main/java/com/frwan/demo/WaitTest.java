package com.frwan.demo;

public class WaitTest {

    public static void testWait() {
        final WaitTest test = new WaitTest();
        new Thread(new Runnable() {
            public void run() {
                test.testMethod();
            }
        }).start();
    }

    /**
     * Wait 必须在被 synchronized修饰， 否则无法拿到monitor
     */
    private synchronized void testMethod() {
        System.out.println("Start-----");
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End-------");
    }
}
