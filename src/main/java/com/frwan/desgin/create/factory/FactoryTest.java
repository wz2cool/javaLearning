package com.frwan.desgin.create.factory;

public class FactoryTest {
    public static void main(String[] args) {
        LogFactory logFactory = new LogFactory();
        ILog iLog = logFactory.create("EventLog");
        iLog.write();
    }
}
