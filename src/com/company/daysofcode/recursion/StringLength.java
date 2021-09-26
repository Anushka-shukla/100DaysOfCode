package com.company.daysofcode.recursion;

public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(strLen(str));
    }

    public static int strLen(String str){
        if(str.equals("")){
            return 0;
        }else{
            return strLen(str.substring(1))+1;
        }

    }
}
