package com.company.daysofcode.basics;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;
        System.out.println("The Sum is = ");
        System.out.println(result);
    }
}
