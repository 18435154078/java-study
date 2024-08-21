package com.test_07_15.Account;

public class Account {
    private int id;  // id
    private  double balance;   // 余额
    private double annualInterestRate;  // 年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * 取钱的操作
     * @param money
     */

    public void widthdraw(double money) {
        if(money <= balance) {
            balance -= money;
        } else {
            System.out.println("余额不足");
        }
    }

    /**
     * 存钱的操作
     * @param money
     */
    public void deposit(double money) {
        if(money > 0) {
            balance += money;
        } else {
            System.out.println("输入有误");
        }
    }

}
