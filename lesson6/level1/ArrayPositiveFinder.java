package homework.les6.level1;

public class ArrayPositiveFinder {
    public static void main(String[] args) {
        int a = findFirstPositiveElemIndex(new int[]{-3, 0, -1, 20, -2, 10});
//        int a = findLastPositiveElemIndex(new int[] {-3, 0, -1, 20, -2, 10});
//        int a = findFirstPositiveElemIndex(new int[] {-3, 0, -1, -4, -2, -5});

        System.out.println(a);
    }

    private static int findFirstPositiveElemIndex(int[] ary) {

        boolean bool = true;
        int res = 0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > 0) {
                res = i;
                bool = false;
                break;
            }
        }
        if (bool) {
            throw new IllegalArgumentException();
        }
        return res;

    }

    private static int findLastPositiveElemIndex(int[] ary) {

        boolean bool = true;
        int res = 0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > 0) {
                res = i;
                bool = false;
            }
        }

        if (bool) {
            throw new IllegalArgumentException();
        }
        return res;
    }
}
