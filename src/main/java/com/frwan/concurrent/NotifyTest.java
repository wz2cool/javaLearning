package com.frwan.concurrent;

import java.util.ArrayList;
import java.util.List;

public class NotifyTest {

    /**
     * 1） wait 释放monitor 对象所有有权
     * 2） 如果wait 被唤起（notify/notifyAll）要去执行，一定是竞争到了monitor，
     * notify 只会唤醒第一个线程， notify唤起所有线程, 然后所有线程
     *
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
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

        // 顺序出的 notify 只会唤醒一个线程，notifyAll 唤醒所有线程。
        Thread.sleep(3000);
        System.out.println("-----------分割线-------------");

        synchronized (test) {
            test.notifyAll();
        }
    }

    public static void producerCustomerDemo() {
        NotifyTest notifyTest = new NotifyTest();
        Object lock = new Object();
        Storage storage = notifyTest.new Storage();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        new Thread(notifyTest.new Producer(storage, lock)).start();
        new Thread(notifyTest.new Customer(storage, lock)).start();
        new Thread(notifyTest.new Producer(storage, lock)).start();
        new Thread(notifyTest.new Customer(storage, lock)).start();
        new Thread(notifyTest.new Producer(storage, lock)).start();
        new Thread(notifyTest.new Customer(storage, lock)).start();
        new Thread(notifyTest.new Producer(storage, lock)).start();
        new Thread(notifyTest.new Customer(storage, lock)).start();
        new Thread(notifyTest.new Producer(storage, lock)).start();
        new Thread(notifyTest.new Customer(storage, lock)).start();
        new Thread(notifyTest.new Producer(storage, lock)).start();
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

    /// region demo
    private class Storage {
        private List<Object> foods;

        public final static int MAX_SIZE = 5;

        public Storage() {
            foods = new ArrayList<Object>();
        }

        public List<Object> getFoods() {
            return foods;
        }

        public void setFoods(List<Object> foods) {
            this.foods = foods;
        }
    }

    private class Customer implements Runnable {

        private Storage storage;
        private final Object lock;

        public Customer(Storage storage, Object lock) {
            super();
            this.storage = storage;
            this.lock = lock;
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                synchronized (lock) {
                    while (storage.getFoods().size() <= 0) {
                        try {
                            System.out.println("货物已空，提示生产者生产");

                            lock.wait();   //当前线程在lock上等待，并释放锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    storage.getFoods().remove(0);
                    lock.notifyAll(); //唤醒消费者与生产者
                    System.out.println("消费者消费1, " + Thread.currentThread().getName() + ", 余量：" + storage.getFoods().size());
                }
            }
        }
    }

    private class Producer implements Runnable {
        private Storage storage;

        private final Object lock;


        public Producer(Storage storage, Object lock) {
            super();
            this.storage = storage;
            this.lock = lock;
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                synchronized (lock) {
                    while (storage.getFoods().size() >= Storage.MAX_SIZE) {
                        try {
                            System.out.println("货物已满，提示消费者消费");

                            lock.wait(); //当前线程在lock上等待，并释放锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    storage.getFoods().add(1);
                    lock.notifyAll();  //唤醒消费者与生产者
                    System.out.println("生产者生产1, " + Thread.currentThread().getName() + ",余量：" + storage.getFoods().size());
                }
            }
        }
    }
}

/// endregion

