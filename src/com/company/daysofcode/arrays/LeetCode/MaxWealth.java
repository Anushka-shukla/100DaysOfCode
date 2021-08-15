package com.company.daysofcode.arrays.LeetCode;

// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main (String[] args){
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
                           };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            // when you start a new row take the um of new row
            int rowSum = 0;

            for(int bankAcc = 0; bankAcc < accounts[person].length; bankAcc++){

                rowSum += accounts[person][bankAcc];
            }
            // now we have sum of accounts of each person
            // check with overall ans
            if(rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
