package com.frwan.desgin.structural.proxy;

public class Math implements IMath {

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mul(double x, double y) {
        return x * y;
    }

    @Override
    public double dev(double x, double y) {
        return x / y;
    }
}
