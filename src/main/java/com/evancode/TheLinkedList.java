package com.evancode;

import java.util.LinkedList;
import java.util.ListIterator;

/*
    LinkedLists

    -Doubly LinkedList
        -Is bidirectional.
        -Consists of multiple nodes.
            -First node is called the "HEAD".
            -Last node is called the "TAIL".
            -Each node contains a reference to the "next" node and to the "previous" node.
                -Head node reference to previous is null.
                -Tail node reference to next is null.
    -Singly LinkedList
        -Is unidirectional.
        -Consists of multiple nodes.
            -First node is called the "HEAD".
            -Last node is called the "TAIL".
            -Each node contains a reference to another node.
            -Tail node reference to next is null
 */
public class TheLinkedList {
    public static void main(String[] args) {

        //Creating new LinkedList
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 24));
        linkedList.add(new Person("Evan", 25));
        linkedList.add(new Person("Julia", 25));

        //Specify particular spot in linkedlist
        linkedList.addFirst(new Person("Amber", 25));
        linkedList.addLast(new Person("Tommy", 24));
        linkedList.add(3, new Person("Mitch", 19));
        linkedList.add(3, new Person("Austin", 21));

        //Create ListIterator
        ListIterator<Person> personListIterator = linkedList.listIterator();

        //Loop through each node in linked list (beginning to end)
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        //New line
        System.out.println();

        //Loop through each node in linked list (end to beginning)
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    //Person
    static record Person(String name, int age) {

    }
}
