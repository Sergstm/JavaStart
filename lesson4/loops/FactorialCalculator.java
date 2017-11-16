package homework.les4.loops;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scn.nextInt();

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Out of range");
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
