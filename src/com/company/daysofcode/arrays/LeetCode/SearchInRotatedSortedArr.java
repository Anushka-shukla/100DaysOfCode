package com.company.daysofcode.arrays.LeetCode;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = findPivot(nums); // 3rd pos for 7

        int res = search(nums, 0); // res = 4
        System.out.println(res);

    }

    // searching the target ele in the arr
    static int search(int[] nums, int target) {
        // find the pivot
        int pivot = findPivot(nums);
        // if we don't have pivot it means the array is not rotated
        // so just do normal binary search
        if(pivot ==-1){
            binarySearch(nums, target, 0, nums.length-1);
        }
        // but if you are able to find the pivot, you'll see two ascending sorted array
        if(nums[target] == pivot){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
            //our search space would be reduced from start to pivot-1
        } else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            // find the middle element
            // if the start and end values are large this won't give us the correct  middle ele as it will exceed the int range

            // mid = (start+end) / 2;
            int mid = start + (end - start)/ 2;
            // if target ele is small it lies on the left hand side
            if(target < arr[mid]){
                end = mid-1; // now end ele is the element is just before the mid ele, while start is same
            } else if(target> arr[mid]){
                // now target exist on the right hand side
                start = mid+1; // if mid is greater than target, the start ele becomes the ele just after the mid ele
            } else{
                // if target is the ele in the mid, the ans is found
                return mid;
            }
        }
        return -1; // ele not found in the array


}

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
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
        if (arr[mid] <= arr[start]) {
            end = mid - 1;
            // if our start ele is greater than mid ele then we can say that our pivot will lie in the first hald
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