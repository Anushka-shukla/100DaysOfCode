package com.company.daysofcode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>(10);
//
//        list.add(67);
//        list.add(627);
//        list.add(671);
//        list.add(267);
//        list.add(867);

        //System.out.println(list);
        //list.contains(627);
        //list.set(0, 99);
        //list.remove(3);
       // System.out.println(list);

        //input
        for(int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);

    }
}
