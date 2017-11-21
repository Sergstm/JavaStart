package homework.les5;

public class PrimesPrinter {
    public static void main(String[] args) {

        int from = -1;
        int to = 11;

        printPrimes(from, to);

    }

    private static void printPrimes(int from, int to) {

        if (from > to) {
            throw new IllegalArgumentException();
        }

        if (from < 0) {
            from = 1;
        }

        for (int i = from; i <= to; i++) {
            boolean bol = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bol = false;
                }
            }
            if (bol && i != 1) {
                System.out.print(" " +i);
            }
        }
        System.out.println();
    }
}
