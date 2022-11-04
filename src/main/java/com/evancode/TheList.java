package com.evancode;

import java.util.ArrayList;
import java.util.List;

/*
    Lists

    -Similar to arrays
    -Is an interface, not a class (Therefore you cannot instantiate a List, only one of its class members.
    -An ordered collection aka sequence.
    -Allows duplicates
    -Not fixed in size like arrays
    -Fast for data retrieval
    -Various implementations
        -ArrayList
        -LinkedList
        -Stack
        -Vector
 */
public class TheList {
    public static void main(String[] args) {

        //Example of List that is unmodifiable
        List<String> colorsUnmodifiable = List.of("blue", "yellow", "red");
        //colorsUnmodifiable.add("pink"); (WONT WORK)

        //It's not really useful to use Lists without specifying a data type
        List list1 = new ArrayList();
        list1.add("blue");
        list1.add("purple");
        list1.add(1);
        list1.add(new Object());

        //Better to specify data type that List should hold. In this case a String.
        List<String> list2 = new ArrayList<>();
        list2.add("blue");
        list2.add("purple");
        list2.add("yellow");
        list2.add("red");

        //Printing both ArraysLists and their sizes
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println();

        //Printing each element in list2 by looping
        for (String color : list2) {
            System.out.println(color);
        }

        //new line
        System.out.println();

        //Another way to print each element
        list2.forEach(System.out::println);

        //new line
        System.out.println();

        //Another way to loop through and print each element
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
