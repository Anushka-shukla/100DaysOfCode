package com.company.daysofcode.arrays.LeetCode;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstAndLastPositionOfEleInArr {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int[] ans = new int[2]; // take an aray of size 2
        ans = searchRange(nums, 7);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

        // why it is returning garbage value

    }

    // return the position of a target ele :- index of first occurrence and the last,
    // if the ele does not exist return [-1,-1]

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for the first occurrence of the target ele
        int start = search(nums, target, true );
        //System.out.println(start);
        int end = search(nums, target, false);
        //System.out.println(end);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start - (start - end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
