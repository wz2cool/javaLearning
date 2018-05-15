package com.frwan.desgin.action.state;

public class RedState extends State {
    private double serviceFee;

    public RedState(State state) {
        this.setBalance(state.getBalance());
        this.setAccount(state.getAccount());
        this.initialize();
    }

    private void initialize() {
        this.interest = 0d;
        this.lowerLimit = -100d;
        this.upperLimit = 0d;
        this.serviceFee = 15d;
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        this.stateChangeCheck();
    }

    @Override
    public void withdraw(double amount) {
        amount = amount - serviceFee;
        System.out.println("No funds available for withdraw!");
    }

    @Override
    public void payInterest() {
        // No interest is paid
    }

    private void stateChangeCheck() {
        if (this.getBalance() > this.upperLimit) {
            this.getAccount().setState(new SilverState(this));
        }
    }

}
