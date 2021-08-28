package com.company.daysofcode.arrays.SearchingLeetCode;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class ElePosInTheInfiniteSortedArr {
    public static void main(String[] args) {
        // we will take a really long array
        int[] num = {2, 3, 5, 6, 8, 9, 11, 12, 16, 19, 21, 25, 26, 29, 31, 34, 39, 41, 42};
        int target = 16;

        int ans = searchInRange(num, target);
        System.out.println(ans);
    }


    static int searchInRange(int[] arr, int target){
        // find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range -> target should be less than end
        // and while target ele is greater than end we will keep doubling the search range
        while(target > arr[end]){
            int newStart = end+1;
            // double the size of the box = 6[index 5]
            // new end = (prev) end + sizeOfBox*2
            // size = end - start + 1
            end = end + (end - start +1) * 2;
            start = newStart;

        }
        return SearchEleInInfiniteArr(arr, target, start, end);
    }

    static int SearchEleInInfiniteArr(int[] num, int target, int start, int end){
        // as the array is infinite we do not know the size of the array, we won't use arr.length

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < num[mid]){
                end = mid - 1;
            } else if( target > num[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
