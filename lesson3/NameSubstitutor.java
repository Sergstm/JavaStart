package homework.les3;

import java.util.Scanner;

public class NameSubstitutor {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter message:");
        String message = scn.nextLine();

        System.out.print("Enter name:");
        String name = scn.nextLine();

        String result = message.replace("${name}", name);

        System.out.println(result);

    }
}
