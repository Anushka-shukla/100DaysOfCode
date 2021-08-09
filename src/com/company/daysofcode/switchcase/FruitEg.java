package com.company.daysofcode.switchcase;

import java.util.Scanner;

public class FruitEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("Mango is king of fruits");
                break;
            case "Apple":
                System.out.println("An Apple a day keeps doctor away!");
                break;
            default:
                System.out.println("Don't know special about this fruit");
        }

    }
}
