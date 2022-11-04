package com.evancode;

import java.util.List;
import java.util.Stack;

/*
    Stacks

    -Represents a LIFO (Last in First out) "stack" of objects
    -Visual Example: Think of a can of pringles
    -Operations
        -Push to Stack to add
        -Pop from stack to remove
        -Peek stack to see top item on stack
        -isEmpty to check if empty
        -Search to check where an element is in the stack, returns an int.
 */
public class TheStack {
    public static void main(String[] args) {

        //Creating new Integer stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Could also create using a list (See use of add vs push)
        List<Integer> stack2 = new Stack<>();
        stack2.add(1);
        stack2.add(2);


        //Get and print element at top of the stack
        System.out.println(stack.peek());

        //Get and print stack size
        System.out.println(stack.size());

        //Remove element on top of stack, and return it
        System.out.println(stack.pop());

        //Again get and print stack size, will have changed since we previously popped
        System.out.println(stack.size());

        //Checks if stack is empty, will return false
        System.out.println(stack.isEmpty());
    }
}
