package com.company.daysofcode.methodsAndFunctions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 7, 3, 8, 9, 78, 34, 23, 16); // any length 0 or more
        func(2, 3, "hello", "hi", "bye", "tata");

    }

    // when we do not know how many arguments we are typing apart from "v" we can give it any name and this
    // internally take/store it as array of integers/string or whichever datatype

    // also variable length arguments must the last one's while passing arguments
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void func(int a, int b, String ...v){

    }
}
