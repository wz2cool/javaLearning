package com.frwan.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class BlockingQueueTest {

    private static BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(10);

    public static void main(String[] args) {
        ScheduledExecutorService product = Executors.newScheduledThreadPool(1);
        Random random = new Random();
        product.scheduleAtFixedRate(() -> {
            int value = random.nextInt(101);
            try {
                blockingQueue.offer(value);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }, 0, 200, TimeUnit.MILLISECONDS);

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println("开始取值");
                    List<Integer> list = new LinkedList<>();
                    blockingQueue.drainTo(list);  //drainTo()将队列中的值全部从队列中移除，并赋值给对应集合
                    list.forEach(System.out::println);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }
}
