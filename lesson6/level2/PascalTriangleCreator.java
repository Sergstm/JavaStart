package homework.les6.level2;

public class PascalTriangleCreator {
    public static void main(String[] args) {

        int n = 7;
        createPascalTriangle(n);
    }

    private static void createPascalTriangle(int n) {

        n++;
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == row || col == 0) {
                    matrix[row][col] = 1;
                }
            }
        }

        for (int row = 1; row < n; row++) {
            for (int col = 1; col < row; col++) {
                matrix[row][col] = matrix[row - 1][col - 1] + matrix[row - 1][col];
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.printf("%3d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
