package com.company.daysofcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        //input using for loop
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            //System.out.println(Arrays.toString(arr));
        }
        // enhanced for loop
        // here j represents ele of the array
        //called for each loop
        for (int j : arr) { // for every ele in the array print the ele
            System.out.print(j + " ");
        }
    }
}
