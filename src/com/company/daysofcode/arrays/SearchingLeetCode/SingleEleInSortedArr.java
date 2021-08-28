package com.company.daysofcode.arrays.SearchingLeetCode;

public class SingleEleInSortedArr {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicate(nums); //10
        System.out.println(ans);
    }

    // a function to find the non-duplicate integer's occurrence

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

       // if array has only 1 ele then, that will be the only non-duplicate one
        if(nums.length == 1){
            return nums[0];
        }
        // if in a sorted array start is not equal to the very next then start will be our non-duplicate
        if(nums[start] != nums[start+1]){
            return nums[start];
        }
        // if in a sorted array the end ele and the ele before it are not equal then end will be our non-duplicate
        if(nums[end] != nums[end -1]){
            return nums[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if mid ele has no duplicate ele before it or after it then it will be unique/ non-duplicate
            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            // checks in RHS of array --- update comment to lhs
            else if(nums[mid] == nums[mid+1] && mid % 2 == 0 || nums[mid] == nums[mid-1] && mid %2 != 0){
               start = mid + 1;
            }// checks on LHS
            else {
                end = mid - 1;
            }

        }
        return -1;
    }
    }