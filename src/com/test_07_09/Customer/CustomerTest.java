package com.test_07_09.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("张", "三");
        c1.setAccount(new Account(1000, 2000, 1.23 / 100));
        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);
        System.out.println(c1.getAccount().getBalance());
    }
}

