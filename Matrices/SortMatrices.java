package Matrices;

import java.util.Arrays;

public class SortMatrices {

    public static void main(String[] args) {
        int[][] matrix = {
                {8, 12, 13},
                {4, 3, 16},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        Arrays.sort(matrix, (a, b) -> a[0] - b[0]);//or a[1]-b[1] or a[2]-b[2]

        System.out.println("Matrix after sorting by the first element of each row:");
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

