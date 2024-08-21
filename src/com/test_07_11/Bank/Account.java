package com.test_07_11.Bank;

public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;  // 余额
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double num) {
        if(num <= 0) {
            System.out.println("输入有误");
        } else {
            balance += num;
            System.out.println("存入成功！剩余" + balance);
        }
    }

    public void withdraw(double num) {
        if(num > balance) {
            System.out.println("余额不足");
        } else {
            balance -= num;
            System.out.println("取出成功！剩余" + balance);
        }
    }


}
