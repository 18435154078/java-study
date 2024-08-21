package com.test_07_17.singleton;

public class BankTest {
    public static void main(String[] args) {
        Bank b1 = Bank.getBank();
        Bank b2 = Bank.getBank();
        System.out.println(b1 == b2);
    }
}

//class Bank {
//    private static Bank bank = new Bank();
//    private Bank() {}
//
//    public static Bank getBank() {
//        return bank;
//    }
//}

class Bank {
    private static Bank bank;
    private Bank() {}

    public static Bank getBank() {
        if(bank == null) bank = new Bank();
        return bank;
    }
}

