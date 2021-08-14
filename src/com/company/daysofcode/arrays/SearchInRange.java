package com.company.daysofcode.arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 23, 5, 45, 90, 67, 21, 78};
        int target = 90;
        System.out.println(SearInRange(arr, target, 2, 6));

    }

    static int SearInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1; // if arr has 0 length ele does not exist
        }
        // run a for loop
        for(int index = start; index <= end ;index++){
            // check for each ele in the array if it is there = target
            int ele = arr[index];
            if(ele == target){
                return index;
            }
        }
        // this line will execute if none of the above statements have executed
        // hence the target not found
        return -1;
    }
}
