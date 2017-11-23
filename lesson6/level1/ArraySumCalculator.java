package homework.les6.level1;

public class ArraySumCalculator {
    public static void main(String[] args) {

        int res = sum(new int[] {2, 1, 3});

        System.out.println(res);
    }

    private static int sum(int[] ary) {

        int sum = 0;
        for (int itm : ary) {
            sum += itm;
        }

        return sum;
    }
}
