package com.test_07_30.Windows;

public class Windows2 {
    public static void main(String[] args) {
        Window2 window = new Window2();

        Thread w1 = new Thread(window);
        Thread w2 = new Thread(window);
        Thread w3 = new Thread(window);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
class Window2 implements Runnable {
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.currentThread().sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this) {
                if(ticketNum <= 0) break;
                System.out.println(Thread.currentThread().getName() + "：票号为：" + ticketNum);
                ticketNum--;
            }
        }
    }
}
