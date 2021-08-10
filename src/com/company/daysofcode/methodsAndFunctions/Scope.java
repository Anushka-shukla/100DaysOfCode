package com.company.daysofcode.methodsAndFunctions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            //int a = 78;// can not be initialised here again in the same block
            a = 75;// reassign the original reference variable to some other value
            System.out.println(a);
            int c = 99;// values initialised in this block, will remain in this bock
        }
        //System.out.println("the value of c is :" + c); // can not be used outside this block

    }


}
