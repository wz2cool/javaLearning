package com.frwan.desgin.action.state;

public class SilverState extends State {

    public SilverState(State state) {
        this(state.getBalance(), state.getAccount());
    }

    public SilverState(double balance, Account account) {
        this.setBalance(balance);
        this.setAccount(account);
        this.initialize();
    }

    private void initialize() {
        this.interest = 0d;
        this.lowerLimit = 0d;
        this.upperLimit = 1000d;
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        this.setBalance(this.getBalance() + amount);
        this.stateChangeCheck();
    }

    @Override
    public void payInterest() {
        this.setBalance(this.interest * this.getBalance());
        this.stateChangeCheck();
    }

    private void stateChangeCheck() {
        if (this.getBalance() < this.lowerLimit) {
            this.getAccount().setState(new RedState(this));
        } else if (this.getBalance() > this.upperLimit) {
            this.getAccount().setState(new GoldState(this));
        }
    }
}
