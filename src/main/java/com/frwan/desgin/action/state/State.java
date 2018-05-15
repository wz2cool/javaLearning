package com.frwan.desgin.action.state;

public abstract class State {
    private Account account;
    private double balance;

    protected double interest;
    protected double lowerLimit;
    protected double upperLimit;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void payInterest();
}
