package com.company.daysofcode.methodsAndFunctions;

public class Swap {
    public static void main(String[] args) {
        int a = 23;
        int b = 34;
        System.out.println("a is now " +a+ " b is now "+b);
        swap(a, b); // swap will not happen

    }

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b= temp; // this change will be valid in this scope only

        return;
    }

}
