package homework.les6.level1;

public class ArrayPositivesCounter {
    public static void main(String[] args) {

        int count = countPositives(new int[] {-3, 0, -1, 4, -2, 5});
//        int count = countPositives(new int[] {-3, 0, -1, -4, -2, -5});

        System.out.println(count);
    }

    private static int countPositives(int[] ary) {

        int cnt = 0;
        for (int itm : ary) {
            if (itm > 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
