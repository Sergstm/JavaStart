package homework.les6.level2;

public class FrequentElemFinder {
    public static void main(String[] args) {

        int[] ary = {1, 2, 1, 0, 3};
//        int[] ary = {2, 1, 2, 1, 0, 3};

        int result = findFrequentElem(ary);

        System.out.println(result);
    }

    private static int findFrequentElem(int[] array) {
        int temp;
        int cnt = 0;
        int[] resAry = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (temp == array[j]) {
                    resAry[cnt] = array[j];
                    cnt++;
                }
            }
        }
        int res = resAry[0];

        return res;
    }
}
