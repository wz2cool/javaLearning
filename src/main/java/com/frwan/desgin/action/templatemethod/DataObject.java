package com.frwan.desgin.action.templatemethod;

public abstract class DataObject {
    public abstract void connect();

    public abstract void select();

    public abstract void process();

    public abstract void disconnect();

    // 这个就是模板方法, 在其他方法变化即可
    public void run() {
        this.connect();
        this.select();
        this.process();
        this.disconnect();
    }
}
