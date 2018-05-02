package com.frwan.desgin.structural.decorator;

public class DatabaseLog extends Log {
    public void write() {
        System.out.println("DatabaseLog.write");
    }
}
