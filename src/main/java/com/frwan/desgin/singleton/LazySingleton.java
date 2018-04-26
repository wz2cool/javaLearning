package com.frwan.desgin.singleton;

public class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getSingleton() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
