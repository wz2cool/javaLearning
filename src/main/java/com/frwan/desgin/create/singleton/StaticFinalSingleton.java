package com.frwan.desgin.create.singleton;

// 饿汉式构造
public class StaticFinalSingleton {
    //类加载时就初始化
    private static final StaticFinalSingleton instance = new StaticFinalSingleton();

    private StaticFinalSingleton(){}
    public static StaticFinalSingleton getInstance(){
        return instance;
    }
}
