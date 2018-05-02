package com.frwan.desgin.structural.decorator;

public class LogPriorityDecorator extends LogDecorator {
    public LogPriorityDecorator(Log log) {
        super(log);
    }

    @Override
    public void write() {
        this.setPriority();
        super.write();
    }

    private void setPriority() {
        System.out.println("set priority...");
    }
}
