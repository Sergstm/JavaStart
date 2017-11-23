package homework.les6.level1;

import java.util.Arrays;

public class ArrayFiller {
    public static void main(String[] args) {

        fill(new int[5], 20);
    }

    private static void fill(int[] ary, int filler) {
        for (int i = 0; i < ary.length; i++) {
            ary[i] = filler;
        }
        System.out.println(Arrays.toString(ary));
    }
}
