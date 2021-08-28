package com.company.daysofcode.arrays.SearchingLeetCode;

// https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = findInMountainArray(arr, target);
        System.out.println(ans);
    }

    // find the mini index of the target ele
    static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0 , peak);
        int secondTry = OrderAgnosticBS(arr, target, peak+1, arr.length-1);

        if (firstTry!= -1){
            return firstTry;
            // otherwise try to search in second half
        }
         return secondTry;
    }



    // find the target ele in the arr, using order agnostic bs
    static int OrderAgnosticBS(int[] arr, int target, int start, int end){

        // find whether the array is sorted in ascending and descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/ 2;

            if(arr[mid] == target){
                return mid;
            }
            // if ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if (target> arr[mid]){
                    start = mid + 1;
                }// if descending order
            } else {
                if(target > arr[mid]){// target exist on left side end changes
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1; // ele not found in the array
    }



    // function that finds peak in the array mountain
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // we are in decreasing/descending part of the array so this may be the answer but look in LHS
                // this is why end is not mid -1
                end = mid;
            } else {
                // otherwise if arr[mid] < arr[mid+1]
                // we are in increasing/ascending part of the array so this may be the answer but look in RHS
                start = mid + 1; // because we kow that mid+1 is greater than mid ele
            }

        }
        // in the end start and end will be pointing to the peak ele because of the above two checks
        // start and end are always trying to find the max ele in the above two checks
        // hence, when they are pointing to just one ele, that is the max ele because that is what the checks say
        // more elaboration : at every point of start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining hence because of the above line that is the best possible ans
        return start; // return end as both will point to same ele
    }
}
