package com.company.daysofcode.recursion;

// 0, 1, 1, 2, 3, 5, 8, 13...(n)[sum prev two nums]
// fibo(N) = fibo() + fibo()

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n){

        // base condition
        if(n < 2){
            return n; // because if fibo(1) = 1, fibo(0) = 0
        }
         return fibo(n-1)+ fibo(n-2);
    }
}
