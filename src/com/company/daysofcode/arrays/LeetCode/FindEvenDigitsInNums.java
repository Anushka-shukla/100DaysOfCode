package com.company.daysofcode.arrays.LeetCode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindEvenDigitsInNums {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num =0; num < nums.length ;num++){
            if(even(nums[num]) == true){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even number of digits or not
    static boolean even(int num){
        if(NumOfDigits(num) % 2 == 0){
            return true;
        }
        return false;
    }

    // shortcut to count digits
    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

   // function to count number of digits in a given number
    static int NumOfDigits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }


}
