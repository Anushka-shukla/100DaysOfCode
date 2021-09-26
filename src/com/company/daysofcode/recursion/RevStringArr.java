package com.company.daysofcode.recursion;
// https://leetcode.com/problems/reverse-string/
public class RevStringArr {
    public static void main(String[] args) {
        String[] arr = {"h", "e", "l", "l", "o"};
    }

    public void reverseString(char [] s){
        revStr(s, 0, s.length-1);
    }

    public void revStr(char [] s, int start, int end) {
        if(start > end){
            return;
        }else {
            swap(s, start, end); // do the swapping
            revStr(s, start+1, end-1); // keep doing the swapping until it's reversed completely
        }
    }

    public static void swap(char[] s, int start, int end){
           char temp = s[start];
           s[start] = s[end];
           s[end] = temp;
        }

    }

