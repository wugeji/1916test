package com.study.xu;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        person p1 =new person(12,"张三");
        person p2 =new person(13,"张三");
        System.out.println(p1.equals(p2));
        Set set = new HashSet();
        set.add(p1);
        System.out.println(p1.hashCode());
        set.add(p2);
        System.out.println(p2.hashCode());
    }
}
