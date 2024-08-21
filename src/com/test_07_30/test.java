package com.test_07_30;

public class test {
    public static void main(String[] args) {
        // EvenNum even = new EvenNum();
        // even.start(); // 启动线程，调用Thread中的run方法

        OddNum odd = new OddNum();

        Thread o = new Thread(odd);
        System.out.println(o.getPriority()); // 获取线程的优先级
        o.setName("线程1");
        // try {
        // o.sleep(100);
        // } catch (InterruptedException e) {
        // throw new RuntimeException(e);
        // }
        o.start();

        System.out.println("----------" + o.isAlive());

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + i + "===========");
            // if(i % 4 == 0) {
            // try {
            // o.join();
            // } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            // }
            // }
        }
        System.out.println("----------" + o.isAlive());
    }
}

class EvenNum extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "===========");
            }
        }
    }
}

class OddNum implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                // try {
                // Thread.sleep(100);
                // } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                // }
                System.out.println(Thread.currentThread().getName() + "：" + i);

            }
        }
    }
}