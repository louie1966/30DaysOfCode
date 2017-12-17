package binary;

import java.util.Scanner;

public class Binary {

    public static void main(String arg[]) {
        int quotient;
        int remainder;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a decimal number:");
        quotient = keyboard.nextInt();

        do {
            remainder = quotient % 2;
            quotient = quotient / 2;

            // String x = String.valueOf(remainder);
            // System.out.print(x);
            System.out.print(remainder);

        } while (quotient != 0);
        System.out.println("");
    }

}
