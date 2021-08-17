package com.company.daysofcode.arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {67, 45, 34, 14, 12 ,9, 7, 3, 1, -19, -23};
        int ans = OrderAgnosticBS(arr, 9);
        System.out.println(ans); // 4th index
    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;

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
}
