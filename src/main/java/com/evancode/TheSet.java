package com.evancode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/*
    Sets

    -Contain NO duplicates
    -Can contain at most, one null element
    -HashSet
        -Elements have no order or sort
    -TreeSet
        Elements have an order or are sorted
 */
public class TheSet {
    public static void main(String[] args) {

        //Create a set of balls
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        //Trying to add an existing element to a set does NOT work
        balls.add(new Ball("blue"));

        //Randomly print the ball objects to the console
        balls.forEach(System.out::println);

        //Print size of set
        System.out.println(balls.size());

        //Remove an element from a set
        balls.remove(new Ball("red"));

        //Randomly print the ball objects to the console
        balls.forEach(System.out::println);

        //Print size of set
        System.out.println(balls.size());
    }

    //Ball
    //record Ball(String color) {}

    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        //Must override in order to be accurate
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" + "color='" + color + '\'' + '}';
        }
    }
}

