package task1;

import java.util.Scanner;

public class FromDecimalToBinaryConverter {

    public static void main(String[] args) {

        int decimal = inputPositiveDecimal();
        System.out.println("decimal = " + decimal);
        String binary = fromDecimalToBinary(decimal);
        System.out.println("binary = " + binary);
    }

    private static int inputPositiveDecimal() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number = ");
        int decimal = scanner.nextInt();

        if (decimal < 0) {
            System.out.println("The number must be positive");
            System.exit(-1);
        }
        return decimal;
    }

    private static String fromDecimalToBinary(int decimal) {

        int tmp;
        String current = "";

        while (decimal != 0) {
            tmp = decimal / 2;
            current += Integer.toString(decimal - (tmp * 2));
            decimal = tmp;
        }
        String binary = reverse(current);
        return binary;
    }

    private static String reverse(String current) {

        String binary = "";

        for (int i = current.length() - 1; i >= 0; i--)
            binary += current.toCharArray()[i];
        return binary;
    }
}
