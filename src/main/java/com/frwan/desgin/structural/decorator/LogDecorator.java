package com.frwan.desgin.structural.decorator;

public class LogDecorator extends Log {
    private final Log log;

    public LogDecorator(Log log) {
        this.log = log;
    }


    public void write() {
        System.out.println("LogDecorator start");
        this.log.write();
        System.out.println("LogDecorator end");
    }
}
