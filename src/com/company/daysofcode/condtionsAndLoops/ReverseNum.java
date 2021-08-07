package com.company.daysofcode.condtionsAndLoops;

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int Rem, RevNum = 0;
        //int count = 0;

        while(num > 0){
            Rem = num % 10;
            num = num / 10;
            RevNum = RevNum*10 + Rem ;
        }

        System.out.println("The reverse is " + RevNum);
    }
}
