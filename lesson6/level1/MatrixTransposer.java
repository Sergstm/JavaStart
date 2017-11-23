package homework.les6.level1;

import java.util.Arrays;

public class MatrixTransposer {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        transpose(matrix);
    }

    private static void transpose(int[][] matrix) {

        int a = 0;
        int b = 0;

        for (int row = 0, cnt = 1; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++, cnt++) {
                matrix[row][col] = cnt;
                System.out.printf("%3d", matrix[row][col]);
                a = row;
                b = col;
            }
            System.out.println();
        }
        System.out.println();

        int[][] aryNew = new int[b + 1][a + 1];
        for (int row = 0; row < aryNew.length; row++) {
            for (int col = 0; col < aryNew[row].length; col++) {
                aryNew[row][col] = matrix[col][row];
                System.out.printf("%3d", aryNew[row][col]);
            }
            System.out.println();
        }
    }
}
