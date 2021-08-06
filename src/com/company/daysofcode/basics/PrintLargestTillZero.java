package com.company.daysofcode.basics;

import java.util.Scanner;

public class PrintLargestTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = 0;
        int largest = 0;
        System.out.println("Enter a number (0 to quit): ");

        while((input = in.nextInt()) != 0){
            if(input> largest){
                largest = input;

            }

        }
        System.out.println("the largest number is : "+ largest);

    }
}
