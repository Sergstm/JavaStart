package homework.les3;

import java.util.Scanner;
import static java.lang.Math.*;

public class FunctionCalculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x:");
        double x = scn.nextDouble();

        double f = log(sin(x) + pow(E, x) * (sqrt(x) / PI));

        System.out.println("f(x) = " + f);

    }
}
