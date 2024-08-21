package com.test_07_30.exp1;

public class CustomerTest {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Customer customer = new Customer(account, "甲");
        Customer customer2 = new Customer(account, "乙");

        customer.start();
        customer2.start();
    }
}

class Account {
    public double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public synchronized void deposit(double num) {
        if(num > 0) {
            balance += num;
            System.out.println(Thread.currentThread().getName() + "：" + balance);
        }
    }
}

class Customer extends Thread{
    public Account account;
    public Customer() {
    }
    public Customer(Account account) {
        this.account = account;
    }
    public Customer(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}
