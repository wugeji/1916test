package com.study.xu;

public class stati {
    private int a = 0;
    private static int s = 0;
    public static void main(String[] args) {

    }
    public static void eat(){
        System.out.println(s);
        System.out.println("kk");
        System.out.println("远程操作");
    }
    public void aa(){
        eat();
    }
}
