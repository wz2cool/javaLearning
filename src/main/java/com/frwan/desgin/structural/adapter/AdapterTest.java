package com.frwan.desgin.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        // 基本上类似于一个补救工作，适配器模式
        LogAdapter logAdapter = new LogAdapter(new DatabaseLog(), new FileLog());
        logAdapter.writeAll();

        // java 源码
        // java.io.OutputStreamWriter(OutputStream)
        // java.io.OutputStreamWriter;
    }
}
