package homework.les6.level1;

public class MatrixPrinter {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {6,5,7}, {-1,8,0}};
//        int[][] matrix = {{1,2,3, 7}, {1,6,5,7}, {-1,8,0,9}};
//        int[][] matrix = {{1,2,3}, {1,6,5}, {-1,8,0}, {5,-3,7}};

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
