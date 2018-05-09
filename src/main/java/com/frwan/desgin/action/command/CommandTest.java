package com.frwan.desgin.action.command;

public class CommandTest {
    public static void main(String[] args) {
        System.out.println("============= Command start. ===============");
        User user = new User();
        user.compute('+', 100);
        user.compute('-', 50);
        user.compute('*', 10);
        user.compute('/', 2);

        user.undo(4);
        user.redo(3);

        // java.lang.Runnable
        System.out.println("========== command end =========");
    }
}
