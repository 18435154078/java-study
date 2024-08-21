package com.test_07_09.Customer;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取钱
    public void withdraw(double n) {
        if (balance < n) {
            System.out.println("余额不足");
        } else {
            balance -= n;
            System.out.println("成功取出：" + n);
        }
    }

    // 存钱
    public void deposit(double n) {
        if (n < 0) {
            System.out.println("您输入有误");
        } else {
            balance += n;
            System.out.println("成功存入：" + n);
        }
    }
}

