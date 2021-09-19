package com.company.daysofcode.strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // all of the below "println" will be different but arguments are different even though the function
        // name is same. this is called function/method overloading

        // println is printing different types of values
        System.out.println(39); // 39
        System.out.println("Anu"); // Anu
        System.out.println(Arrays.toString(new int[] {2,4,5})); // garbage value without Array.toString
        String name = null;
        System.out.println(name); // null

    }
}
