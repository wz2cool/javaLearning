package com.frwan.desgin.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeTest {
    public static void main(String[] args) {
        Picture root = new Picture("Root");
        root.add(new Line("Line"));
        root.add(new Rectangle("Rectangle"));
        root.draw();
        // 组合模式很像 叶子。

        // java 代码，自己是一个map， 也可以添加一个map
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> childMap = new HashMap<String, String>();
        map.putAll(childMap);
    }
}
