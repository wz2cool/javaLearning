package com.frwan.desgin.structural.proxy;

public class MathProxy implements IMath {
    // 代理保护了原来的对象不被访问。
    private final Math math = new Math();

    @Override
    public double add(double x, double y) {
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        return math.mul(x, y);
    }

    @Override
    public double dev(double x, double y) {
        return math.dev(x, y);
    }
}
