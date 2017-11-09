public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 13579;  // Input: any positive number

        int first = n % 100000/10000;
        int second = n % 10000/1000;
        int third = n % 1000/100;
        int fourth = n % 100/10;
        int fifth = n % 10;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
    }

}
