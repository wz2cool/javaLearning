package com.frwan.concurrent;

public class NotifyTest {

    /**
     * 1） wait 释放monitor 对象所有有权
     * 2） 如果wait 被唤起（notify/notifyAll）要去执行，一定是竞争到了monitor，
     * notify 只会唤醒第一个线程， notify唤起所有线程。
     *
     * @throws InterruptedException
     */
    public static void testNotify() throws InterruptedException {
        final NotifyTest test = new NotifyTest();

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                public void run() {
                    test.testMethod();
                }
            }).start();
        }

        Thread.sleep(1000);
        synchronized (test) {
            test.notify();
        }

        Thread.sleep(3000);
        System.out.println("-----------分割线-------------");

        synchronized (test) {
            test.notifyAll();
        }
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
