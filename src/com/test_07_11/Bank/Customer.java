package com.test_07_11.Bank;

public class Customer {
    private String name;   // 姓名
    private Account account;   //账户
    public Customer(String name) {
        this.name = name;
    }
    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
