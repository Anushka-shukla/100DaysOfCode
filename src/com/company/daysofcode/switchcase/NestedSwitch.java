package com.company.daysofcode.switchcase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Hello there!");
                break;
            case 2:
                System.out.println("Hey!");
                break;
            case 3:
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT":
                        System.out.println("It's me, Anu!");
                        break;
                    case "Design":
                        System.out.println("It's some other guy!");
                        break;
                    default:
                        System.out.println("Invalid department!");
                }
            default:
                System.out.println("Enter correct employee id!");

        }


    }
}
