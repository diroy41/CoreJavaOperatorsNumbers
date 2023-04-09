package com.perscholas.java_operatorsNumbers;

public class exercise1 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        //I think the decimal will be around 3-5 and the binary will be 100
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x) + "\n");

        int x2 = 9;
        System.out.println(Integer.toBinaryString(x2));
        x2 = x2 << 1;
        System.out.println(x2);
        System.out.println(Integer.toBinaryString(x2)+ "\n");

        int x3 = 17;
        System.out.println(Integer.toBinaryString(x3));
        x3 = x3 << 1;
        System.out.println(x3);
        System.out.println(Integer.toBinaryString(x3)+ "\n");

        int x4 = 88;
        System.out.println(Integer.toBinaryString(x4));
        x4 = x4 << 1;
        System.out.println(x4);
        System.out.println(Integer.toBinaryString(x4)+ "\n");




    }
}
