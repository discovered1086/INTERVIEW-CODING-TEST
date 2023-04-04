package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class DuckNumberTest {

    public static void main(String[] args) {
        /*
            Duck numbers are numbers with zeros inside them
         */
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            boolean isDuckNumber = false;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                if (digit == 0) {
                    isDuckNumber = true;
                    break;
                }
                theNumber = theNumber / 10;
            }
            System.out.println("The number is " + (isDuckNumber ? " a duck number" : "not a duck number"));
        }
    }
}
