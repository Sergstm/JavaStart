package homework.les4.loops;

import java.util.Scanner;

public class RangePrinter {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int first = scn.nextInt();
        System.out.print("Enter last num: ");
        int last = scn.nextInt();

        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(" " + i);
            }
        } else if (first > last) {
            for (int i = first; i >= last; i--) {
                System.out.print(" " + i);
            }
        } else if (first == last) {
            System.out.println(first);
        }

    }
}
