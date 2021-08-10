package com.company.daysofcode.methodsAndFunctions;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        sum(); // function calling, can be called as many times
        int ans = sum2();
        System.out.println(ans);
        int result = sum3(23, 34);
        System.out.println(result);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is = " +sum);
    }// return type void

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }// return type int

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
