package com.company.daysofcode.arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 13},
                {67, 3, 56, 7},
                {39, 9, 68}
        };
        int target = 56; // [1,2]
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        int res = searchMax(arr);
        System.out.println(res);
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    // find max ele from 2 D array
    static int searchMax(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length ; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
