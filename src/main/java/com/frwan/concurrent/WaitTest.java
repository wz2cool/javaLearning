package com.frwan.concurrent;

public class WaitTest {

    public static void main(String[] args) {
        final WaitTest test = new WaitTest();
        new Thread(new Runnable() {
            public void run() {
                test.testMethod();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                test.testMethod();
            }
        }).start();
    }

    /**
     * Wait 必须在被 synchronized修饰， 否则无法拿到monitor,
     * 所以Wait 主要是使用在多线程中,
     * Wait 会释放monitor（注意这里和sleep 区别， sleep 不会释放monitor） 所以，当线程1 进入，会打印start--，
     * 到了wait 以后释放锁，所以当线程2进入也是能够打印 start--
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
