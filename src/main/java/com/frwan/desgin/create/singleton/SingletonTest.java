package com.frwan.desgin.create.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getSingleton();
        StaticFinalSingleton staticFinalSingleton = StaticFinalSingleton.getInstance();
        StaticNestedSingleton staticNestedSingleton = StaticNestedSingleton.getInstance();


        // java 源码使用 singleton
        java.lang.Runtime.getRuntime();
    }
}
