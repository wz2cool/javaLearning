package com.frwan.concurrent;

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
     * Wait 必须在被 synchronized修饰， 否则无法拿到monitor,
     * 所以Wait 主要是使用在多线程中
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
