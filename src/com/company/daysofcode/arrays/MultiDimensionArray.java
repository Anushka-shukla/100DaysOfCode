package com.company.daysofcode.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);//3
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        // input
        for(int row = 0; row<arr.length ; row++){
           for(int col = 0; col<arr[row].length ;col++) {
               arr[row][col] = in.nextInt();
           }
        }
        // output
        for(int row = 0; row<arr.length ; row++){
                System.out.println(Arrays.toString(arr[row]) + " ");
        }
            System.out.println();


    }
}
