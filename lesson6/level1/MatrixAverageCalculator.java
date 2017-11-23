package homework.les6.level1;

public class MatrixAverageCalculator {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        };

        int res = avg(matrix);

        System.out.println(res);
    }

    private static int avg(int[][] matrix) {

        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res += matrix[i][j];
            }
        }
        res /= Math.pow(matrix.length, 2);
        return res;
    }
}
