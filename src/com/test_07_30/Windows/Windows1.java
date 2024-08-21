package com.test_07_30.Windows;

public class Windows1 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread {
    static int ticketNum = 100;
    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            // synchronized (lock) {
            synchronized (Window.class) { // 当前类.class的方式
                if (ticketNum <= 0)
                    break;
                System.out.println(Thread.currentThread().getName() + "：票号为：" + ticketNum);
                ticketNum--;
            }
        }
    }
}
