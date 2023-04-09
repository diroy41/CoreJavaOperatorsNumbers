package com.perscholas.java_operatorsNumbers;

public class exercise2 {
    public static void main(String[] args) {
        int x= 150;
        System.out.println(Integer.toBinaryString(x));
        x = x>>2;
        //I predict that the decimal and binary values will be lower? IDK need to study binary/decimal more!
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x)+ "\n");

        int x2= 225;
        System.out.println(Integer.toBinaryString(x2));
        x2 = x2>>2;
        System.out.println(x2);
        System.out.println(Integer.toBinaryString(x2)+ "\n");

        int x3= 1555;
        System.out.println(Integer.toBinaryString(x3));
        x3= x3>>2;
        System.out.println(x3);
        System.out.println(Integer.toBinaryString(x3)+ "\n");

        int x4= 32456;
        System.out.println(Integer.toBinaryString(x4));
        x4 = x4>>2;
        System.out.println(x4);
        System.out.println(Integer.toBinaryString(x4)+ "\n");

    }
}
