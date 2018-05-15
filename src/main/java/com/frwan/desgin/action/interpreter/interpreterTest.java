package com.frwan.desgin.action.interpreter;

import java.util.ArrayList;
import java.util.List;

public class interpreterTest {
    public static void main(String[] args) {
        String roman = "MCMXXVIII";
        Context context = new Context(roman);
        List<Expression> tree = new ArrayList<>();
        tree.add(new ThousandExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        for (Expression exp :
                tree) {
            exp.interpret(context);
        }

        System.out.println(String.format("%s = %s", roman, context.getOutput()));
    }
}
