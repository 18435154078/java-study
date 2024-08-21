package com.test_07_15.Account;

public class CheckAccount extends Account {
    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void widthdraw(double account) {
        if(account <= getBalance()) {
            super.widthdraw(account);
        } else if(account <= getBalance() + overdraft) {
            overdraft -= account - getBalance();
            super.widthdraw(getBalance());
        } else {
            System.out.println("额度不足！");
        }
    }
}
