package homework.les4.conditions;

import java.util.Scanner;

public class AgeParser {

    public static void main(String[] args) {

        System.out.print("Enter age: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int num = Integer.parseInt(str);

        if (num < 1 || num > 120) {
            throw new IllegalArgumentException("Range 1...120");
        }

        System.out.println("Result " + num);
    }
}



