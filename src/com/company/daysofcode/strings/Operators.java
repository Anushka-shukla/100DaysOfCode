package com.company.daysofcode.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b' );// operator is converting the alphabet into character value -> Adding ASCII values
        System.out.println("a" + "b"); // concatenation
        System.out.println('a'+ 3);
        System.out.println((char)('a'+ 3)); // type casting
        System.out.println("a" +1);
        // this is same as "a"+"1" after a few steps
        //integer will be converted to integer that will call toString()
        System.out.println("Anu" + new ArrayList<>()); // concatenated with empty array list
        System.out.println("Anushka" + new Integer(56));
       // System.out.println( new Integer(56) + new ArrayList<>()); gives error -> 2 complex types
        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans);


    }
}
