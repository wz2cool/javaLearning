package com.frwan.desgin.action.command;

public class CalculatorCommand extends Command {
    char operator;
    int operand;
    Calculator calculator;

    public CalculatorCommand(Calculator calculator, char operator, int operand) {
        this.calculator = calculator;
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        this.calculator.operation(this.operator, this.operand);
    }

    @Override
    public void unExecute() {
        this.calculator.operation(undo(this.operator), this.operand);
    }

    private char undo(char operator) {
        char undo = ' ';
        switch (operator) {
            case '+':
                undo = '-';
                break;
            case '-':
                undo = '+';
                break;
            case '*':
                undo = '/';
                break;
            case '/':
                undo = '*';
                break;
        }
        return undo;
    }
}
