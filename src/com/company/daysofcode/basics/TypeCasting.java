package com.company.daysofcode.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int to float automatic type conversion
        /**
        float num1 = input.nextFloat();
        System.out.println(num1);
        **/
        //float to int narrow conversion -- type casting
        /**
        int i = (int)(23.72f);
        System.out.println(i);
         **/

        //automatic type promotion in expression
        /**
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);
         **/
        /**
        byte a = 50;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);
        **/
        /**
        int number = 'a';
        System.out.println(number);
         */
        /**
        int number = 'A';
        System.out.println(number);
        */

        //Java follows unicode principles
        System.out.println("प्रणाम");
        System.out.println(21.23 * 23);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
