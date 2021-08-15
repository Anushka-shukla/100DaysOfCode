package com.company.daysofcode.arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 8, 10, 34, 67};
        int ans = binarySearch(arr, 10);
        System.out.println(ans); // 4th index

    }

    // return index
    // return if it does not exist
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;

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


}
