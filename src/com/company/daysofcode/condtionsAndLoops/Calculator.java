package com.company.daysofcode.condtionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take the input from the user till the user prints X or x
        int ans = 0;

        while (true) {
            //take the operator as input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input the operators as inputs
                System.out.println("Enter the 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation!!");
                }
              System.out.println(ans);
            }

        }
    }

