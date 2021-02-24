package com.ss.week.one;

import java.util.Random;

public class FindMax2DArray {
    public static void main(String[] args) {
        double[][] arr = generate2DArray(5,5);
        double max = Double.NEGATIVE_INFINITY;
        int posX = 0, posY = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    posX = i;
                    posY = j;
                }
            }
        }
        
        System.out.print("The Max is: " + max + " at position: " + posX + "," + posY);
    }

    private static double[][] generate2DArray(int row, int col) {
        Random r = new Random();
        double[][] board = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //range -1000 to 1000
                board[i][j] = r.nextDouble() * (1000 - (-1000)) + (-1000);
                //System.out.print(board[i][j] + " ");
            }
            //System.out.println();
        }
        return board;
    }
}
