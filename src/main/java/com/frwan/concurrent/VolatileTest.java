package com.frwan.concurrent;


/**
 * volatile内存语义总结如下
 * <p>
 * 当线程对volatile变量进行写操作时，会将修改后的值刷新回主内存
 * 当线程对volatile变量进行读操作时，会先将自己工作内存中的变量置为无效，之后再通过主内存拷贝新值到工作内存中使用。
 * Synchronized与volatile区别
 * <p>
 * volatile只能修饰变量，而synchronized可以修改变量，方法以及代码块
 * volatile在多线程中不会存在阻塞问题，synchronized会存在阻塞问题
 * volatile能保证数据的可见性，但不能完全保证数据的原子性，synchronized即保证了数据的可见性也保证了原子性
 * volatile解决的是变量在多个线程之间的可见性，而sychroized解决的是多个线程之间访问资源的同步性
 */
public class VolatileTest extends Thread {

    // 不加上 volatile 会导致 isRunning 被设置但是其他线程看不见，所以只会打印  进入run.......
    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void run() {
        System.out.println("进入run.............");
        while (isRunning) {
        }
        System.out.println("isUpdated的值被修改为为false,线程将被停止了");
    }

    public static void testVolatile() throws Exception {
        VolatileTest volatileTest = new VolatileTest();
        volatileTest.start();
        Thread.sleep(1000);
        volatileTest.setRunning(false);
    }
}