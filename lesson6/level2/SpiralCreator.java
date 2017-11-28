package homework.les6.level2;

public class SpiralCreator {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        createSpiral(rows, cols);
    }

    private static void createSpiral(int rows, int cols) {

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("Wrong input data");
        }

        int[][] matrix = new int[rows][cols];
        int up = 0;
        int right = cols;
        int down = rows;
        int left = -1;
        int row = 0;
        int col = 0;
        int counter = 1;

        while (counter < rows * cols) {

            right -= 1;
            for (; col <= right; col++) {
                matrix[row][col] = counter;
                counter++;
            }
            counter--;
            col--;

            down -= 1;
            for (; row <= down; row++) {
                matrix[row][col] = counter;
                counter++;
            }
            counter--;
            row--;

            left += 1;
            for (; col >= left; col--) {
                matrix[row][col] = counter;
                counter++;
            }
            counter--;
            col++;

            up += 1;
            for (; row >= up; row--) {
                matrix[row][col] = counter;
                counter++;
            }
            counter--;
            row++;
        }

        for (int rowOut = 0; rowOut < rows; rowOut++) {
            for (int colOut = 0; colOut < cols; colOut++) {
                System.out.printf("%3d", matrix[rowOut][colOut]);
            }
            System.out.println();
        }

    }
}
