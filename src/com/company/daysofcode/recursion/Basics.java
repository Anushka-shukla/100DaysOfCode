package com.company.daysofcode.recursion;

public class Basics {
    public static void main(String[] args) {
        // write a function that prints hello world
        printN(1);
    }
    static void printN(int n){
        // a base condition to stop the function calling-- a condition where our recursion func will stop making new calls
        if(n==5) {
            System.out.println(5);
            return;// return the func from here only
        }
        System.out.println(n);
        printN(n + 1);
        // recursive call
        // if you are calling a func again and again, you can treat it as separate call in stack
        // if no base condition then function calls will keep happening stack will keep getting filled
        // and every call takes memory and a time will come when the memory exceeds the limit this
        // will give stack overflow error
    }
}
