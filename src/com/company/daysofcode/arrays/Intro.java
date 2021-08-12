package com.company.daysofcode.arrays;

public class Intro {
    public static void main(String[] args) {
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5];
        //int array has "0"  default value in the array
        // initialisation: actual memory creation happens here, object is being created in the heap memory
        System.out.println(ros[1]);
        String[] arr = new String[3]; // string array has "null" as default value in the arr
        // string array
        System.out.println(arr[0]);


    }

}
