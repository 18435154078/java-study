package com.test_07_30.singleton;

import java.sql.SQLOutput;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Customer1 c1 = new Customer1(bank);
        Customer1 c2 = new Customer1(bank);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

    }
}

class Bank {
    volatile Bank instance;   // 为了避免出现指令重排，需要将instance声明为volatile
    static int num = 0;

    public synchronized Bank getInstance() {
        if(instance == null) instance = new Bank();
        return instance;
    }
}

class Customer1 implements Runnable {
    Bank bank;
    public Customer1(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.bank.getInstance());
    }
}

class Customer2 implements Runnable {
    Bank bank;
    public Customer2(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.bank.getInstance());
    }
}




