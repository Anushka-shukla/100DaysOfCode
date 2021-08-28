package com.company.daysofcode.arrays.SearchingLeetCode;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        int res = splitArray(nums, m);

        System.out.println(res);
    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            // in the end of the loop this will contain the nax item from the array
            start = Math.max(start ,nums[i]);
            end += nums[i] ; // sum of the values

        }

        // binary search
        while (start < end){
            // try for middle as potential ans
            int mid = start + (end - start)/2;

            // calculate in how many pieces you can divide this in with this max sum
            int sum =0;
            int pieces = 1; // atleast we can divide it into 1 piece

            // for every number
            // for (int num=0; num<nums.length; num++){
            for(int num:nums){
                // if current sum + num is exceeding the allowed sum i.e.
                if (sum + num >mid){
                    // you can not add in this subarray, make new one
                    // say you add this num in new subarray , then sum = num
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }

            }
            if(pieces > m){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return end; // either start or end because it will have same values, start== end
    }
}
