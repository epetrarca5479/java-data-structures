package com.evancode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
    HASH FUNCTIONS AND HASH CODES
 */
public class TheMap2 {
    public static void main(String[] args) {

        //Create and add elements to HashMap
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamie"), new Diamond("African Diamond"));

        //Example
        System.out.println(new Person("Jamie").hashCode());
        System.out.println(new Person("Jamie").hashCode());
        System.out.println(map.get(new Person("Jamie")));

    }

    //Person
    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        //IF you comment this out, line 21 breaks
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

    }

    //Diamond
    record Diamond(String name) {

    }
}

