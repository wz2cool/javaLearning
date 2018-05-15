package com.frwan.desgin.action.state;

public class GoldState extends State {

    public GoldState(State state) {
        this(state.getBalance(), state.getAccount());
    }

    public GoldState(double balance, Account account) {
        this.setBalance(balance);
        this.setAccount(account);
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        this.stateChangeCheck();
    }

    @Override
    public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
        this.stateChangeCheck();
    }

    @Override
    public void payInterest() {
        this.setBalance(this.getBalance() * this.interest * this.getBalance());
        stateChangeCheck();
    }

    private void stateChangeCheck() {
        if (this.getBalance() < 0d) {
            this.getAccount().setState(new RedState(this));
        } else if (this.getBalance() < lowerLimit) {
            this.getAccount().setState(new SilverState(this));
        }
    }
}
