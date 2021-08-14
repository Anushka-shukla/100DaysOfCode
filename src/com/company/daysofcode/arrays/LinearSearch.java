package com.company.daysofcode.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 5, 45, 90};
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Enter the element to be found: ");
//        Scanner in = new Scanner(System.in);
//        int ele = in.nextInt();
//        LinearSearch(arr, ele);


        // other way
        int target = 5;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

        static void LinearSearch(int[] arr, int findEle){
            // no ele in the arr
        for(int i = 0; i < arr.length; i++){
            if(findEle == arr[i]){
                System.out.println("Element" + arr[i] + "found at index " + i);
            }

            }
        }

        // return true or false
    static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return false; // if arr has 0 length ele does not exist
        }
        // run a for loop
        for(int index =0; index < arr.length ;index++){
            // check for each ele in the array if it is there = target
            int ele = arr[index];
            if(ele == target){
                return true;
            }
        }
        // this line will execute if none of the above statements have executed
        // hence the target not found
        return false;
    }

        // another way -- return the index
        // return the index if ele found in arr
        static int linearSearch(int[] arr, int target){
          if(arr.length == 0){
              return -1; // if arr has 0 length ele does not exist
               }
          // run a for loop
            for(int index =0; index < arr.length ;index++){
                // check for each ele in the array if it is there = target
                int ele = arr[index];
                if(ele == target){
                    return index;
                }
            }
            // this line will execute if none of the above statements have executed
            // hence the target not found
            return -1;
        }

    }




//