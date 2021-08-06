package com.company.daysofcode.basics;

import java.util.Scanner;

public class PrintTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0 ;
        int sum = 0 ;

        System.out.println("Enter a number (0 to quit): ");
        while((input = in.nextInt()) !=  0){
          sum = sum + input ;
        }
        System.out.println(sum);
    }
}
