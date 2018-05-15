package com.frwan.desgin.action.state;

public class Account {
    private State state;
    private String owner;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Account(String owner) {
        this.owner = owner;
        this.state = new SilverState(0d, this);
    }

    public double getBalance() {
        return state.getBalance();
    }

    public void deposit(double amount) {
        this.state.deposit(amount);
        System.out.println(String.format("Deposited: %s", amount));
        System.out.println(String.format(" Balance = %s", this.getBalance()));
        System.out.println(String.format(" Status = %s", this.state.getClass().getName()));
    }

    public void withdraw(double amount) {
        this.state.withdraw(amount);
        System.out.println(String.format("Withdraw: %s", amount));
        System.out.println(String.format(" Balance = %s", this.getBalance()));
        System.out.println(String.format(" Status = %s", this.state.getClass().getName()));
    }

    public void rayInterest() {
        this.state.payInterest();
        System.out.println("Interest paid ---");
        System.out.println(String.format(" Balance = %s", this.getBalance()));
        System.out.println(String.format(" Status = %s", this.state.getClass().getName()));
    }
}
