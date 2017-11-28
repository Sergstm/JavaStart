package homework.les6.level2;

public class CyclicShifter {
    public static void main(String[] args) {

        int[] ary = {0, 1, 2, 3, 4}; int shift = 1;
//        int[] ary = {0, 1, 2, 3, 4}; int shift = -1;
//        int[] ary = {0, 1, 2, 3, 4}; int shift = 0;
//        int[] ary = {0, 1, 2, 3, 4}; int shift = 5;

        cyclicShift(ary, shift);
    }

    private static void cyclicShift(int[] array, int shiftPositions) {

        if (shiftPositions > 0 && shiftPositions != array.length) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        } else if (shiftPositions < 0){
            int temp = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
        }

        for (int iter : array) {
            System.out.printf("%3d", iter);
        }
    }
}
