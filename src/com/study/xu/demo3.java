package com.study.xu;



public class demo3 {
    public static void main(String[] args) {


        test();
    }
    public static void test(){



        Integer i = new Integer(128);
        Integer j = new Integer(128);
        System.out.println(i==j);
        System.out.println(i.equals(j));

        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));

        int ij =1;
        int jj =1;
        System.out.println(ij==jj);

    }

    public static class haeq {
    }
}
