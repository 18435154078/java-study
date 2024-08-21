package com.test_07_15.Account;

/**
 *
 * @author song
 */

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5 / 100);
        account.widthdraw(30000);
        System.out.println("您的账户余额为：" + account.getBalance());
        account.widthdraw(2500);
        account.deposit(3000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println(account.getMonthlyInterestRate());


        CheckAccount ck = new CheckAccount(1122,20000,4.5 / 100, 5000);
        ck.widthdraw(5000);
        System.out.println(ck.getOverdraft());
        ck.widthdraw(18000);
        System.out.println(ck.getOverdraft());
        ck.widthdraw(3000);
        System.out.println(ck.getOverdraft());
    }
}
