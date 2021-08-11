package com.company.daysofcode.methodsAndFunctions;

public class Shadowing {
    static int x = 90; // static means object independent
    // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);// 90
        int x = 40;//class variable at line 4 is shadowed by this
        System.out.println(x); // 40
        fun();
    }

    static void fun(){
        System.out.println(x);//90
    }

}
