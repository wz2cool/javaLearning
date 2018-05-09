package com.frwan.desgin.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        MathProxy mathProxy = new MathProxy();
        double result = mathProxy.add(1, 2);
        System.out.println("result " + result);


        //
        // java.lang.reflect.Proxy
    }
}
