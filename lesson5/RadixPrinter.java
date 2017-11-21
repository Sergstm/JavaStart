package homework.les5;

public class RadixPrinter {
    public static void main(String[] args) {

        int n = 147292;
        int r = 10;

        long a = printInRadix(n, r);
        System.out.println(a);
    }

    private static long printInRadix(int n, int rad) {

        if (n < 0 || rad < 2 || rad > 10) {
            throw new IllegalArgumentException();
        }

        long output = 0;
        int res = n;
        int cnt = 0;
        int div, out;

        if (rad == 10) {
            output = n;
        } else {
            while (res >= 1) {
                div = res / rad;
                if (div == 0) {
                    out = res;
                } else  {
                    out = res % div;
                }
                res = div;
                cnt++;

                output +=  out * (long) Math.pow(10, cnt - 1);
            }
        }
        return output;
    }
}
