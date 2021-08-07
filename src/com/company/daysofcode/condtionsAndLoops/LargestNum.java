package com.company.daysofcode.condtionsAndLoops;

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int largest = a;

        if(b > largest){
            largest = b;
        }
        if(c > largest){
            largest = c;
        }

        System.out.println("The lagest num is = " + largest);
    }
}
