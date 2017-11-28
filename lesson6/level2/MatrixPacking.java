package homework.les6.level2;

public class MatrixPacking {
    public static void main(String[] args) {

        int[][] sourceMatrix = {
                {1, 2, 3},
                {0, 0, 0},
                {4, 5, 6}
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
//        System.out.println("row = " + numRow); System.out.println("col = " + numCol);
        int[][] matrixOut = new int[numRow][numCol];

        int count = 0;
        for (int row = 0; row < numRow; row++) {
            for (int col = 0; col < numCol; col++) {
                if (matrix[row][col] == 0) {
                    count += 1;
//                    System.out.print(" " + count);
                } else {
                    count = 0;
//                    System.out.print(" " + count);
                }
            }
            if (count == numCol) {
                for (int i = 0; i < numRow; i++) {
                    for (int j = 0; j < numCol; j++) {
                        if (matrix[i][j] == 0) {
                            matrixOut[i][j] = matrix[i + 1][j];
                        } else {
                            matrixOut[i][j] = matrix[i][j];
                        }
                    }
                }
                numRow -= 1;
            }
        }

        for (int row = 0; row < numRow; row++) {
            for (int col = 0; col < numCol; col++) {
                System.out.printf("%3d", matrixOut[row][col]);
            }
            System.out.println();
        }

    }
}
