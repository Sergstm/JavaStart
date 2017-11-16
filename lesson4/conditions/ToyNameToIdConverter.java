package homework.les4.conditions;

import java.util.Scanner;

public class ToyNameToIdConverter {

    public static void main(String[] args) {

        System.out.print("Enter toy name: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        switch (str) {
            case "Car":
                System.out.println(0);
                break;
            case "Lego":
                System.out.println(1);
                break;
            case "Doll":
                System.out.println(2);
                break;
            case "Puzzle":
                System.out.println(3);
                break;
                default: throw new IllegalArgumentException("Not available");
        }

    }
}
