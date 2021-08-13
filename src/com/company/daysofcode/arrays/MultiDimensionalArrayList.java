package com.company.daysofcode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list = new ArrayList <>();

        // initialise 3 list
        for(int i = 0; i < 3 ; i++ ) {
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j++ ) {
                // get the array list at index "i"  and add something to it
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
