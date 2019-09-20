package com.study.xu;

import java.util.Objects;

public class haseq {

}
class person{
    private  int age;
    private  String name;


    @Override
    public int hashCode() {
        return 0;
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
