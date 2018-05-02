package com.frwan.desgin.structural.adapter;

public class DatabaseLog extends Log implements ILogTarget {
    public void write() {
        System.out.println("Hello world");
        writeLog();
    }

    public void writeLog() {
        System.out.println("database Log write log");
    }
}
