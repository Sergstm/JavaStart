package homework.les4.loops;

import java.util.Scanner;

public class RangeWithStepPrinter {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int first = scn.nextInt();
        System.out.print("Enter last num: ");
        int last = scn.nextInt();
        System.out.print("Enter step: ");
        int step = scn.nextInt();

        if (first < last && step > 0) {
            for (int i = first; i <= last; i = i + step) {
                System.out.print(" " + i);
            }
        } else if (first > last && step < 0) {
            for (int i = first; i >= last; i = i + step) {
                System.out.print(" " + i);
            }
        } else {
            throw new IllegalArgumentException("Wrong operation");
        }
    }
}
