package com.company.daysofcode.strings;



public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba"; // null || ""
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        // we have to put check so that index array bound does not occur when str is empty
        if(str == null || str.length() == 0){
            return true;
        }

        // convert to lowercase
        str = str.toLowerCase();
        for(int i =0; i< str.length()/2 ;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
