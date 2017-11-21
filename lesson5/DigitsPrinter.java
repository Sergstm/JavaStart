package homework.les5;

public class DigitsPrinter {
    public static void main(String[] args) {

        int in = 147292;

        int a = printDigits(in);

        System.out.println(a);
    }

    private static int printDigits(int n) {

        int[] ary = new int[10];

        int count = 1_000_000_000;
        for (int i = 0; i < 10; i++, count /= 10) {
            ary[i] = (n % (10 * count)) / count;
        }

        int res = 0;
        for (int i = ary.length - 1, j = 0; i >= 0; i--, j++) {
            res += (int) Math.pow(10, i) * ary[j];
        }

        return res;
    }
}
