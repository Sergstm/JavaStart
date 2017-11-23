package homework.les6.level1;

public class IdentityMatrixChecker {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean result = isIdentity(matrix);
        System.out.println(result);
    }

    private static boolean isIdentity(int[][] matrix) {

        int h = 0;
        int w = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                h = i;
                w = j;
            }
        }

        if (h != w) {
            throw new IllegalArgumentException("Wrong matrix format");
        }

        boolean res = false;
        int sumAll = 0;
        int sumMain = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumAll += matrix[i][j];
                if (i == j) {
                    sumMain += matrix[i][j];
                }
            }
        }

        if (sumAll == sumMain && sumMain == matrix.length) {
            res = true;
        }

        return res;
    }
}
