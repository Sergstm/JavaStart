package homework.les3;

import java.util.Scanner;

public class DifferentRadixSummator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter X in Bin:");
        String binIn = scn.nextLine();
        int numB = Integer.parseInt(binIn);

        int lenB = binIn.length() - 1;

        int sumB = 0;
        int btnOut = 0;
        for (int i = lenB; i >= 0; i--) {
            int btn = (int)(numB / Math.pow(10, i)) % 10;
            btnOut += btn * Math.pow(2, i);
        }

        System.out.print("Enter Y in Oct:");
        String octIn = scn.nextLine();
        int numO = Integer.parseInt(octIn);

        int lenO = octIn.length() - 1;

        int sumO= 0;
        int octOut = 0;
        for (int i = lenO; i >= 0; i--) {
            int oct = (int)(numO / Math.pow(10, i)) % 10;
            octOut += oct * Math.pow(8, i);
        }

        System.out.print("Enter Z in Hex:");
        String hexIn = scn.nextLine();
        int hexOut = Integer.parseInt(hexIn, 16);

        int res = btnOut + octOut + hexOut;

        System.out.println("Out = " + res);

    }
}
