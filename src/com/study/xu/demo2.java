package com.study.xu;

public class demo2 extends  A {
    private int a = test();//5但是子类有重写该方法，实现由子类实现//8
    private static int b = my();//3

    demo2(){
        System.out.println("1");//10
    }
    static{
        System.out.println("5");//4
    }
    {
        System.out.println("2");//9
    }
    public int test(){
        System.out.println("3");
        return 1 ;
    }
    public static int my(){
        System.out.println("4");
        return 1;
    }

    public static void main(String[] args) {
        demo2 d = new demo2();//9,7,4,5,3,6,8,3,2,1
    }

}
class A{
    private int a =test();//5但是子类有重写该方法，实现由子类实现
    private static  int b =my();//1

    A(){
        System.out.println("8");//7

    }

    {
        System.out.println("6");//6
    }


    static{
        System.out.println("7");//2
    }

    public int test(){
        System.out.println("10");
        return 1;
    }

    public static int my(){
        System.out.println("9");
        return 1;
    }

}
