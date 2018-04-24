package com.frwan.demo;

public class SynchronizedTest {

    /**
     * 保证对于 test 这个对象上的调用是同步的，
     * 就是当线程1访问 test 对象上method1，那么这个其实这个对象是被锁了，
     * 线程2无法执行test中method2方法
     */
    public static void testNormalMethodSync() {
        final SynchronizedTest test = new SynchronizedTest();
        new Thread(new Runnable() {
            public void run() {
                test.method1();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                test.method2();
            }
        }).start();
    }


    /// region help method.
    private synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    private synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }
    /// endregion
}
