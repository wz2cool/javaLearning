package com.frwan.desgin.structural.decorator;

public class LogErrorDecorator extends LogDecorator {
    public LogErrorDecorator(Log log) {
        super(log);
    }

    @Override
    public void write() {
        SetError();
        super.write();
    }

    private void SetError() {
        System.out.println("set error...");
    }
}
