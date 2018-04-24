package com.frwan.demo;

public class SynchronizedTest {

    /**
     * [对普通方法同步]
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

    /**
     * [静态方法（类）同步]
     * 这里静态方法，会导致锁在整个类上，为了证明这个我们新建立两个对象，test,test2
     * test 调用静态方法以后，其实整个类被锁了，
     * test2 即使是另外一个对象，但是由于整个类被锁了，也会阻塞。
     */
    public static void testStaticMethodSync() {
        final SynchronizedTest test = new SynchronizedTest();
        final SynchronizedTest test2 = new SynchronizedTest();

        new Thread(new Runnable() {
            public void run() {
                test.staticMethod1();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                test2.staticMethod2();
            }
        }).start();
    }


    public static void testBlockMethodSync() {
        final SynchronizedTest test = new SynchronizedTest();
        new Thread(new Runnable() {
            public void run() {
                test.blockSyncMethod1();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                test.blockSyncMethod2();
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

    private synchronized static void staticMethod1() {
        System.out.println("Static Method 1 start");
        try {
            System.out.println("Static Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Static Method 1 end");
    }

    private synchronized static void staticMethod2() {
        System.out.println("Static Method 2 start");
        try {
            System.out.println("Static Method 2 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Static Method 2 end");
    }

    private final Object blockLocker = new Object();

    private void blockSyncMethod1() {
        synchronized (blockLocker) {
            System.out.println("blockSync method1 start");
            try {

                System.out.println("blockSync method1 execute");
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("blockSync method1 end");
        }
    }

    private void blockSyncMethod2() {
        synchronized (blockLocker) {
            System.out.println("blockSync method2 start");
            try {
                System.out.println("blockSync method2 execute");
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("blockSync method2 end");
        }
    }

    /// endregion
}
