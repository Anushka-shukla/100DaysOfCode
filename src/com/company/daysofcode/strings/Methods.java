package com.company.daysofcode.strings;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Anushka Shukla";
        // converts into array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // it only creates a new array of having just lowe case letters
        // as strings are immutable
        // get index of a particular letter
        System.out.println(name.indexOf('a'));
        System.out.println(Arrays.toString(name.split(" "))); // so wherever we have space split it
    }
}
