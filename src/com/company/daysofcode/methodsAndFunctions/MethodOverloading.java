package com.company.daysofcode.methodsAndFunctions;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(67); // call the function that has number as parameter
        fun("Anu");
        //which function/method will be called is determined by the arguments given this is called
        //method overloading and this happens when the program is compiled

        demo(2, 4, 6, 7, 1);
        demo("Anu", "Dua", "Billi", "Harry");

        // if we provide no argument to this method it will throw error it is called ambiguity, the method will not
        // know which one to run

    }
        static void demo(int ...v){
            System.out.println(Arrays.toString(v));

        }

        static void demo(String ...name){
            System.out.println(Arrays.toString(name));
        }


        static void fun(int a){
            System.out.println(a);

        }

        static void fun(String name){
            System.out.println(name);

        }
}
