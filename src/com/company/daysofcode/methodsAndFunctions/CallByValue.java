package com.company.daysofcode.methodsAndFunctions;

import java.util.Arrays;

public class CallByValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {2 , 3, 45, 12, 78};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change (int[] nums) {
        nums[0] = 99; // if you make change to the obj via this ref variable same obj will be changed

    }
}
