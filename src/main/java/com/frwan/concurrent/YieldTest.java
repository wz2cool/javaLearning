package com.frwan.concurrent;

public class YieldTest implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.yield();
        }
    }

    /**
     * yield方法的作用是暂停当前线程，以便其他线程有机会执行，
     * 不过不能指定暂停的时间，并且也不能保证当前线程马上停止。
     * yield方法只是将Running状态转变为Runnable状态
     */
    public static void main(String[] args) {
        YieldTest run = new YieldTest();
        Thread t1 = new Thread(run, "FirstThread");
        Thread t2 = new Thread(run, "SecondThread");
        t1.start();
        t2.start();
    }
}
