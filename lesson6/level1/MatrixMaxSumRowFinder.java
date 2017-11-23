package homework.les6.level1;

public class MatrixMaxSumRowFinder {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        };

        int result = maxSumRowIndex(matrix);

        System.out.println(result);
    }

    private static int maxSumRowIndex(int[][] matrix) {

        int res = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                res += i;
            }
        }
        return res;
    }
}
