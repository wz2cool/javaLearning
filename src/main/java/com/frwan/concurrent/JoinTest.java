package com.frwan.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JoinTest {
    /**
     * 这里我们可以通过并发，最终在join 以后父线程等待所有子线程完成，有点像C# Task.waitAll
     */
    public static void main(String[] args) {
        final JoinTest joinTest = new JoinTest();

        List<Thread> jobThread = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            final int useI = i;
            Thread test = new Thread(new Runnable() {
                public void run() {
                    joinTest.work(1000 * useI);
                }
            });
            test.start();
            jobThread.add(test);

        }

        Iterator<Thread> jobIterator = jobThread.iterator();
        while (jobIterator.hasNext()) {
            Thread thread = jobIterator.next();
            try {
                thread.join(); //调用join方法
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jobIterator.remove();
        }

        System.out.println("Finished~~~");

    }

    private void work(long millis) {
        try {
            System.out.println(String.format("'%s' work start", Thread.currentThread().getName()));
            Thread.sleep(millis);
            System.out.println(String.format("'%s' work end", Thread.currentThread().getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
