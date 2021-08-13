package com.company.daysofcode.arrays;

import java.util.Arrays;

public class MaxEleInArr {
    public static void main(String[] args) {
        int[] arr = {1, 15, 21, 7, 23};
        MaxEle(arr);
        System.out.println(MaxEle(arr));
        System.out.println(MaxEleInRange(arr, 0, 3 ));
    }

    static int MaxEle(int[] arr) {
        // imagine that arr is not empty
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i =0; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // max in a given range
    static int MaxEleInRange(int[] arr, int start, int end){
        //edge cases
        if(end > start){
            return -1;
        }
        if(arr== null){
            return -1;
        }
        int max = arr[start];
        for(int i = start; i <= end ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
