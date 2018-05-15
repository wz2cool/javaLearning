package com.frwan.desgin.action.state;

public class StateTest {
    public static void main(String[] args) {
        Account account = new Account("Jim Johnson");
        account.deposit(500.0);
        account.deposit(300.0);
        account.deposit(550.0);
        account.rayInterest();
        account.withdraw(2000.0);
        account.withdraw(1100.0);
    }
}
