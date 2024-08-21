package com.test_07_30.exp2;

public class ProductConsumer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p = new Producer(clerk, "机器1");
        Consumer c1 = new Consumer(clerk, "消费者1");
        Consumer c2 = new Consumer(clerk, "消费者2");

        p.start();
        c1.start();
        c2.start();
    }
}

class Clerk {
    private static int productNum;

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        Clerk.productNum = productNum;
    }

    public synchronized void addNum() {
        if(productNum < 20) {
            productNum++;
            System.out.println("生产第" + productNum + "个产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void subNum() {
        if(productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("消费第" + productNum + "个产品");
            productNum--;
            notify();
        }
    }
}

class Producer extends Thread {
    Clerk clerk;
    public Producer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1000);
                clerk.addNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Clerk clerk;
    public Consumer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(4000);
                clerk.subNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}