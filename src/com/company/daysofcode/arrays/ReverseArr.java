package com.company.daysofcode.arrays;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 15, 21, 7, 23};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
