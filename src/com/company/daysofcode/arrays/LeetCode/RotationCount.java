package com.company.daysofcode.arrays.LeetCode;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {1 ,2, 3, 4, 5}; // ans - 0
                // {15, 18, 2, 3, 6, 12}; // ans - 2
                //{4, 5, 6, 7, 0, 1, 2}; // ans - 4
        int res = countRotations(nums);
        System.out.println(res);
    }

    // pivot+1 times the array is rotated
    // pivot is shifting to right with each rotation so pivot+1 times the rotation will be
    static int countRotations(int[] nums){
        // for non-duplicate values in the array
        int pivot = findPivot(nums);

        // if array is not rotated return 0 number of rotations +1-1 =0

        return pivot+1;

    }


    // function to find pivot
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // when our mid is greater than mid+1 ele the pivot will be mid
            // let's assume our end ele is our mid ele, and this will check for mid+1, so it will give us array
            // index out of bound, so we will make sure that our end always stays greater than mid while this
            // check runs.
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid; // return the index of mid that is the count of rotation
            }

            // when ele before mid is greater than mid
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1; // even in this case our mid will be our pivot
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
                // if our start ele is greater than mid ele then we can say that our pivot will lie in the first half
                // of the arr
            }
            // arr[end] < arr[mid]
            else {
                start = mid + 1;
                // this means that our pivot will lie in the second half of the sorted array where we have greater ele
            }
        }
        return -1;
    }


    // function: if our array has duplicate values
    static int findPivotInArrWithoutDuplicateEle(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // mid will be out pivot i.e the largest of all the ele
            }
            // arr[mid] > arr[mid + 1] this will return array index out of bound so we have to make sure that
            // we check : mid < end

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1; // even in this case our mid will be our pivot
            }
            // if the ele at mid, start, and end are same then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                // NOTE: What if the ele at start and end were the pivots
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start; // start is pivot
                }
                start++;
                // then check whether end is pivot or not
                if(arr[end] < arr[end -1]){
                    return end-1;

                }
                end--;
            }
            // left side is sorted so pivot must be on right side
            if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}