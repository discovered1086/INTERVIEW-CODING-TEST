package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class ReverseANumberSimplerSolutionTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int theResult = 0;

            while (theNumber != 0) {
                int digit = theNumber % 10;
                theResult = theResult * 10 + digit;
                theNumber = theNumber / 10;
            }

            System.out.println("The reversed number is: " + theResult);
        }

        /*
         * Here's how it works
         *  Number: 123456
         *
         *  digit
         *  6
         *  5
         *  4
         *  3
         *  2
         *  1
         *
         *  result
         *  6
         *  6 X 10 + 5 = 65
         *  65 X 10 +4 = 654
         *  654 X 10 + 3 = 6543
         *  6543 X 10 + 2 = 65432
         *  65432 X 10 + 1 = 654321
        */
    }
}
