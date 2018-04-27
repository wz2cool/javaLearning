package com.frwan.desgin.create.singleton;

// 推荐。
public class StaticNestedSingleton {
    // 静态内部类 初始化一次。
    private static class SingleHolder {
        // 只会初始化一次。
        private static final StaticNestedSingleton INSTANCE = new StaticNestedSingleton();
    }

    public static StaticNestedSingleton getInstance() {
        return SingleHolder.INSTANCE;
    }
}
