package com.frwan.desgin.action.command;

public class Calculator {
    private int total = 0;

    public void operation(char operator, int operand) {
        switch (operator) {
            case '+':
                total += operand;
                break;
            case '-':
                total -= operand;
                break;
            case '*':
                total *= operand;
                break;
            case '/':
                total /= operand;
                break;
        }
        System.out.println(String.format("Total=%s(following %s %s)", total, operator, operand));
    }
}
