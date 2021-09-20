package com.company.daysofcode.strings;

public class StrBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder() ;
        for(int i =0; i<26 ;i++){
            char ch = (char)('a' + i);
            builder.append(ch);

        }
        System.out.println(builder.toString());

        builder.deleteCharAt(0); // will delete char at 0 index i.e 'a'
        System.out.println(builder);

        //reverse string
        builder.reverse();
        System.out.println(builder);
    }
}
