package homework.les6.level2;

import java.util.Arrays;

public class MatrixPacking {
    public static void main(String[] args) {

        int[][] sourceMatrix = {
                {1, 2, 3},
                {0, 0, 0},
                {4, 5, 6}
        };
        int[][] sourceMatrix1 = {
                {1, 0, 3},
                {0, 0, 0},
                {4, 0, 6}
        };

        packMatrix(sourceMatrix);
    }

    private static void packMatrix(int[][] matrix) {

        int numRow = 0;
        int numCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                numRow = row + 1;
                numCol = col + 1;
            }
        }
        int[][] matrixOut = new int[numRow][numCol];
        int[][] finalMatrix = new int[numRow][numCol];

        int colPos = 0;
        int colZeroSum = 0;
        for (int row = 0; row < numRow; row++) {
            colPos = Arrays.binarySearch(matrix[row], 0);
            if (colPos > 0) {
                colZeroSum++;
            }
        }

        if (colZeroSum == numCol) {
            for (int row = 0; row < numRow; row++) {
                for (int col = 0; col < numCol; col++) {
                    if (col == colPos) {
                        matrixOut[row][col] = matrix[row][col + 1];
                    } else {
                        matrixOut[row][col] = matrix[row][col];
                    }
                }
            }
            numCol -= 1;
        } else {
            for (int row = 0; row < numRow; row++) {
                for (int col = 0; col < numCol; col++) {
                    matrixOut[row][col] = matrix[row][col];
                }
            }
        }

        int rowPos = 0;
        int rowSum = 0;
        int rowZeroSum;
        for (int row = 0; row < numRow; row++) {
            rowZeroSum = 0;
            for (int col = 0; col < numCol; col++) {
                if (matrixOut[row][col] == 0) {
                    rowZeroSum++;
                }
            }
            if (rowZeroSum == numCol) {
                rowPos = row;
                rowSum = rowZeroSum;
            }
        }

        if (rowSum == numCol) {
            for (int row = 0; row < numRow; row++) {
                for (int col = 0; col < numCol; col++) {
                    if (row == rowPos) {
                        finalMatrix[row] = matrixOut[row + 1];
                    }
                    else {
                        finalMatrix[row][col] = matrixOut[row][col];
                    }
                }
            }
            numRow -= 1;
        }

        for (int row = 0; row < numRow; row++) {
            for (int col = 0; col < numCol; col++) {
                System.out.printf("%3d", finalMatrix[row][col]);
            }
            System.out.println();
        }
    }
}
