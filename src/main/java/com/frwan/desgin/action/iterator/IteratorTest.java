package com.frwan.desgin.action.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
}
