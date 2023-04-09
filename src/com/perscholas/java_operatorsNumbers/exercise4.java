package com.perscholas.java_operatorsNumbers;
//Ahmed Ali 4/9/2023 RTT-57
public class exercise4 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;
        //I do not know how it will turn out with the OR maybe it will return only 7 or 17?
        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }
}
