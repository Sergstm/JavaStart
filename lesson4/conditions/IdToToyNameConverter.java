package homework.les4.conditions;

import java.util.Scanner;

public class IdToToyNameConverter {

    public static void main(String[] args) {

        System.out.print("Enter toy id: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num == 0) {
            System.out.println("Car");
        } else if (num == 1) {
            System.out.println("Lego");
        }else if (num == 2) {
            System.out.println("Doll");
        }else if (num == 3) {
            System.out.println("Puzzle");
        } else {
            throw new IllegalArgumentException("Not available");
        }

    }
}
