package homework.les5;

public class RhombusPrinter {
    public static void main(String[] args) {

        int size = 5;

        printRhombus(size);
    }

    private static void printRhombus(int size) {

        if (size % 2 == 0 || size < 0) {
            throw new IllegalArgumentException();
        }

        int part = size / 2;
        String[][] ary = new String[size][size];

        int r = part;
        int c = part;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (x == c + y || y == r + x || x == c - y || y == r - x || y == r+r+r - x) {
                    ary[x][y] = " * ";
                } else {
                    ary[x][y] = " . ";
                }

                System.out.printf("%5s", ary[x][y]);
            }
            System.out.println();
        }
    }
}
