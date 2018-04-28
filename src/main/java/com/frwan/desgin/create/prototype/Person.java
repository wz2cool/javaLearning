package com.frwan.desgin.create.prototype;

import java.util.List;

public class Person implements Cloneable {

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
