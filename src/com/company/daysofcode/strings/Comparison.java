package com.company.daysofcode.strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Anu";
        String b = "Anu";
        String c = a;
        System.out.println(c==a);// pointing to same obj, so true
        System.out.println(a==b);// pointing to same object so true

        String d = new String("Shiny");
        String e = new String("Shiny");
        System.out.println(d == e);// false
        System.out.println(d.equals(e));// true

        System.out.println(d.charAt(0));// S
    }
}
