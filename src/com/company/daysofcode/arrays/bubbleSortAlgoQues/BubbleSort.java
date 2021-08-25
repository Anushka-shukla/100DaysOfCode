package com.company.daysofcode.arrays.bubbleSortAlgoQues;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        // if the array is sorted then no swap will occur so
        boolean swapped;

        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step the max ele will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the ele is smaller than the previous item j < j-1
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // if swap is taking place, then true
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i it means the array is sorted
            // hence stop the program
            if(!swapped){ // !false = true
                break;
            }
        }

    }

}
