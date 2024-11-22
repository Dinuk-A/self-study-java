package org.example.concepts.collections;

import java.util.Arrays;

public class MultiDimArrays {

    public static void createArrays() {

        // 1 without values
        // has 3 rows + 4 cols
        int[][] twoDArray = new int[3][4];

        // 2 with values
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // 3 using a loop
        int[][] arrCreatedByLoop = new int[3][4];
        for (int i = 0; i < arrCreatedByLoop.length; i++) {
            for (int j = 0; j < arrCreatedByLoop[i].length; j++) {

                // accessing array elements(more on next method)
                arrCreatedByLoop[i][j] = i + j;
            }
        }
        System.out.print(Arrays.deepToString(arrCreatedByLoop));

        // just a space in console
        System.out.println();

        // multi d arrays that has diffeerent cols in their rows
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[5]; // first row has 5 elements(cols)
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];

        // to print the array
        System.out.println(Arrays.deepToString(matrix));

        // or use a loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // just a space in console
        System.out.println();

        // using an enhance loop
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();

        }

    }

    // 2
    public static void elemManipulation() {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // access elements
        System.out.println(matrix[0][1]);
        matrix[1][2] = 10;

    }

}
