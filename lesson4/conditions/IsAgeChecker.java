package homework.les4.conditions;

import java.util.Scanner;

public class IsAgeChecker {

    public static void main(String[] args) {

        System.out.print("Enter age: ");
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        boolean res = (age >= 1 && age <= 120);

        System.out.println(res);
    }
}
