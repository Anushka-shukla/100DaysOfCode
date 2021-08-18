package com.company.daysofcode.arrays;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr  = {2, 3, 5, 9, 14, 16, 18} ;
        int target = 8;
        System.out.println(FloorOfNum(arr, 8));
    }

    // return the index: greatest no >= target
    static int FloorOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/ 2;

            if(target < arr[mid]){
                end = mid-1;
            } else if(target> arr[mid]){

                start = mid+1;
            } else{

                return mid;
            }
        }
        return end;
    }
}


