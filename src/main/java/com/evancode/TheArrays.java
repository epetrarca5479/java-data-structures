package com.evancode;

import java.util.Arrays;

/*
    Arrays

    -Fixed in size

 */
public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];

        colors[0] = "Purple";
        colors[1] = "Blue";
        colors[2] = "Red";
        colors[3] = "Yellow";
        colors[4] = "Green";

        //Loop from beginning to end
        for (int i = 0; i < colors.length; i++) {

            if (i == colors.length - 1) {
                System.out.print(colors[i]);
            } else {
                System.out.print(colors[i] + ", ");
            }
        }

        //New line
        System.out.println("");
        //New line
        System.out.println("");

        //Loop from end to beginning
        for (int i = colors.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(colors[i]);
            } else {
                System.out.print(colors[i] + ", ");
            }
        }

        //New line
        System.out.println("");
        //New line
        System.out.println("");

        //Enhanced for loop to loop in order
        for (String color : colors) {
            System.out.print(color + ", ");
        }

        //New line
        System.out.println("");
        //New line
        System.out.println("");

        //Print each color on new line in order
        Arrays.stream(colors).forEach(System.out::println);
    }
}
