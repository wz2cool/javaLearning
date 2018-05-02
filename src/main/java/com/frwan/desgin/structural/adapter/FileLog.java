package com.frwan.desgin.structural.adapter;

public class FileLog extends Log implements ILogTarget {
    public void write() {
        System.out.println("Hello world");
        writeLog();
    }

    public void writeLog() {
        System.out.println("File Log write Log");
    }
}
