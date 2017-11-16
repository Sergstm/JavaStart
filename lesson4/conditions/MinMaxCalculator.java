package homework.les4.conditions;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class MinMaxCalculator {

    public static void main(String[] args) {

        int a = 5;
        int b = -2;

        int min = min(a, b);
        int max = max(a, b);

        System.out.println("Min = " + min + ", Max = " + max);
    }
}
