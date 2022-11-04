package com.evancode;

import java.util.LinkedList;
import java.util.Queue;

/*
    Queues

    -Represents a FIFO (First in First out) "queue" of objects
    -Is an interface, not a class (Therefore you cannot instantiate a Queue, only one of its class members.
    -Visual Example: Think of a line at the grocery market
    -Operations
        -add(): to add to queue
        -offer(): to add to queue when possible to do so without violating space limits
        -remove(): remove an element from queue, and return it, but throw exception if empty
        -poll(): remove an element from queue, and return it
        -peek(): check and return next element in queue, doesn't remove it
        -element():
 */
public class TheQueue {
    public static void main(String[] args) {

        //Creating new Integer stack, adding some Person objects
        Queue<Person> line = new LinkedList<>();
        line.add(new Person("Alex", 24)); //First in queue
        line.add(new Person("Evan", 25)); //Second in queue
        line.add(new Person("Julia", 25)); //Third in queue

        //Check size of queue
        System.out.println(line.size());

        //Check next element in queue
        System.out.println(line.peek());

        //Remove element from a queue, return in
        System.out.println(line.poll());

        //Check size of queue
        System.out.println(line.size());

        //Check next element in queue
        System.out.println(line.peek());
    }

    //Person
    static record Person(String name, int age) {

    }
}
