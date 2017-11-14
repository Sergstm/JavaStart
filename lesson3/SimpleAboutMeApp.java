package homework.les3;

import java.util.Scanner;

public class SimpleAboutMeApp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scn.nextLine();

        System.out.print("Enter your surname:");
        String surname = scn.nextLine();

        System.out.print("Enter your age:");
        int age = scn.nextInt();

        System.out.println("I'm " + name + " " + surname + ", " + age + " years old");

    }
}
