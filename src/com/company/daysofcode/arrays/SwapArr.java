package com.company.daysofcode.arrays;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 9};
        swap(arr, 1, 3); // it's going to take two indices
        // array elements at index 1 & 3 have swapped their positions
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
