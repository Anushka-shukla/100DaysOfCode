package com.company.daysofcode.condtionsAndLoops;

import java.util.Scanner;
public class CountOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Enter a number whose occurrence is to be found: ");
        int Findnum = in.nextInt();
        int count = 0;
        int R = 0;

        while(num > 0 ) {
            R = num % 10; //last digit - remainder
            if (Findnum == R) {
                count++;
            }
            num = num/10;
        }
        System.out.println("The occurrence of "+ Findnum+ " is "+ count+ " times.");
    }

}
