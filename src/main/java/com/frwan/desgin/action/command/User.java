package com.frwan.desgin.action.command;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Calculator calculator = new Calculator();
    private List<Command> commands = new ArrayList<>();
    private int current = 0;

    public void redo(int levels) {
        System.out.println(String.format("---- redo %s levels", levels));
        if (current < commands.size() - 1) {
            this.commands.get(current++).execute();
        }
    }

    public void undo(int levels) {
        System.out.println(String.format("--- undo %s levels", levels));
        for (int i = 0; i < levels; i++) {
            if (current > 0) {
                commands.get(--current).unExecute();
            }
        }
    }

    public void compute(char operator, int operand) {
        Command command = new CalculatorCommand(this.calculator, operator, operand);
        command.execute();

        // Add command to undo list
        this.commands.add(command);
        current++;
    }
}
