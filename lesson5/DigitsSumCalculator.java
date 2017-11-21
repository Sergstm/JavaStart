package homework.les5;

public class DigitsSumCalculator {
    public static void main(String[] args) {

        int from = 147292;
        int to = 147292;

        int result = digitsSum(from, to);

        System.out.println(result);
    }

    private static int digitsSum(int from, int to) {

        if (from > to) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (i < -9 || i > 9) {
                String str = String.valueOf(i);
                char ch;
                for (int j = 0; j < str.length(); j++) {
                    ch = str.charAt(j);
                    sum += Character.getNumericValue(ch);
                }
            } else {
                sum += i;
            }
        }
        sum = Math.abs(sum);
        return sum;
    }
}
