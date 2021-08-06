package com.company.daysofcode.basics;

import java.util.Scanner;

public class Prime {

 public static void main (String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n = input.nextInt();

     if(n<=1){
         System.out.println("Neither Prime nor composite!");
         return;
     }
     int c = 2;
     if(n == 4){
         System.out.println("Not Prime!");
     } else {
         while (c * c <n) {
             if (n % c == 0) {
                 System.out.println("NOt Prime!");
                 return;
             }
             c = c + 1;
         }
         if(c * c > n){
             System.out.println("Prime");
         }
     }
 }

}
