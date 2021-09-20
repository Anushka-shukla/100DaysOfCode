package com.company.daysofcode.strings;

public class Performance {
    public static void main(String[] args) {
        String series = "" ;
        for(int i =0; i<26 ;i++){
            char ch = (char)('a' + i);
            //System.out.println(ch);
            series = series + ch;

        }
        System.out.println(series); // what it does internally is it creates
        // a new object and appending with the old one and not really changing the object -> so much memory wastage

        // better way - can we have an object just changes the initial object and not really create a new obj
        // Use String builders
    }
}
