package com.evancode;

import java.util.HashMap;
import java.util.Map;

/*
    Maps
    -Cannot contain duplicate keys
    -Each key can map to at most, 1 value.

    -A few IMPLEMENTATIONS
        -HashTable (Null NOT allowed, Synchronized)
        -HashMap (Null allowed)
            -LinkedHashMap (Null allowed, Doubly LinkedList implementation, SLOW)
        -SortedMap
            -NavigableMap
                -TreeMap (Sorted, Null NOT allowed)
 */
public class TheMap {
    public static void main(String[] args) {

        //Create HashMap and add some elements
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex", 24));
        map.put(2, new Person("Alexa", 25));
        map.put(3, new Person("Maria", 21));

        //Trying to add elements to a key containing the same elements
        map.put(3, new Person("Maria", 21));

        //Print map and size
        System.out.println(map);
        System.out.println(map.size());
        System.out.println();


        //Trying to modify elements at a key
        map.put(3, new Person("Maria", 26));

        //Print map and size
        System.out.println(map);
        System.out.println(map.size());
        System.out.println();

        //Grab and print element from map based on key
        System.out.println(map.get(1));

        //Check and print if map contains a key
        System.out.println();
        System.out.println(map.containsKey(2));

        //Get and print all entries in a set
        System.out.println();
        System.out.println(map.entrySet());

        //Get and print all keys in a set
        System.out.println();
        System.out.println(map.keySet());

        //Loop through map
        System.out.println();
        map.entrySet().forEach(System.out::println);

        //Loop through map
        System.out.println();
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        //Another way
        System.out.println();
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        //Remove from a map
        map.remove(3);

        //Print map and size
        System.out.println();
        System.out.println(map);
        System.out.println(map.size());

        //Remove all from a map
        map.clear();

        //Print map and size
        System.out.println();
        System.out.println(map);
        System.out.println(map.size());
    }

    //Person
    static record Person(String name, int age) {

    }
}

