package com.mazenrashed.fetchr.data.local;

import java.util.Random;

public class MagicSqareHelper {

    public int[][] calculateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int number = n * n;
        int row = 0;
        int column = n / 2;
        int currRow;
        int currCol;
        while (number >= 1) {
            magicSquare[row][column] = number;
            number--;
            currRow = row;
            currCol = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = currRow + 1;
                column = currCol;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        return magicSquare;
    }
}
