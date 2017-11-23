package homework.les6.level1;

import java.util.Arrays;

public class SequenceArrayCreator {
    public static void main(String[] args) {

        createSequenceArray(5);
//        createSequenceArray(-1);
    }

    private static void createSequenceArray(int size) {

        if (size < 0) {
            throw new IllegalArgumentException("Incorrect size");
        }

        int[] ary = new int[size];
        for (int i = 0; i < size; i++) {
            ary[i] = i;
        }
        System.out.println(Arrays.toString(ary));
    }
}
