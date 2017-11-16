package homework.les4.loops;

import java.util.Scanner;

public class FilledMatrixPrinter {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter rows num: ");
        int rows = scn.nextInt();

        System.out.print("Enter cols num: ");
        int cols = scn.nextInt();

        System.out.print("Enter filler num: ");
        int filler = scn.nextInt();

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("Wrong number");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + filler);
            }
            System.out.print("\n");
        }

    }
}
