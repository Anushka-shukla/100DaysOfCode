package com.company.daysofcode.arrays;

public class CeilingOfANumber {
    public static void main(String[] args) {
       int[] arr  = {2, 3, 5, 9, 14, 16, 18} ;
       int target = 15;
        System.out.println(CeilingOfNum(arr, 15));

    }
   // we will not return -1 if number not found, but we will return the next greater than (or equal to) num that exist

    static int CeilingOfNum(int[] arr, int target) {

        // what if target is greater than the greatest number in the array
        if(target > arr[arr.length] -1){
            return -1;
        }

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
        return start;
    }


}
