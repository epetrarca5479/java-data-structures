package com.evancode;

import java.util.Arrays;

/*
    2D Arrays

    -Can be thought of us an Array of Arrays
    -Can be an array with x and y 'like' dimensions
    -Fixed in size, like arrays

 */
public class TheArrays2D {

    public static void main(String[] args) {

        //2d char array example 1
        char[][] board = new char[3][3];

        //Set values to 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //Modify  board
        board[0][0] = 'o';
        board[0][1] = 'o';
        board[0][2] = 'o';
        board[1][0] = 'o';
        board[1][1] = 'o';
        board[1][2] = 'o';
        board[2][0] = 'o';
        board[2][1] = 'o';
        board[2][2] = 'o';

        //Print 2d array
        System.out.println(Arrays.deepToString(board));

        //2d array example 2
        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        //Print 2d array
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
