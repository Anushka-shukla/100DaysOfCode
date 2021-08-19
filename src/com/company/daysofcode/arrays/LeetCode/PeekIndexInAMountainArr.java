package com.company.daysofcode.arrays.LeetCode;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeekIndexInAMountainArr {
    // we can apply binary search because first part is in ascending order and second in desc
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }


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
