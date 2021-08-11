package com.company.daysofcode.methodsAndFunctions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        //int n = input.nextInt();
       // boolean ans = isArmstrong(n);
       // System.out.println(ans);

        // print all the 3 digit armstrong num
        for(int i = 100; i < 1000 ;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }

        }
    }

    // cube of all the digits when added gives the same number
    static boolean isArmstrong(int num) {
        int original = num;
        int rem = 0;
        int sum = 0;
        int cube = 0;
        while (num > 0) {

        rem = num % 10;
        num = num / 10;
        cube = rem * rem * rem;
        sum = sum + cube;


    }
        if(sum == original){
            return true;
        }
        else {
            return false;
        }

    }
}
