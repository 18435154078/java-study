package com.test_07_11.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank banks = new Bank();  // 创建一个银行

        Customer newCustomer = banks.addCustomer("张三");
        newCustomer.setAccount(new Account(100));
        newCustomer.getAccount().deposit(1000);
    }
}
