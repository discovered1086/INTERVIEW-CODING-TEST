package org.kingshuk.corejava.numberrelatedprograms.assignments;

import java.util.Scanner;

public class CountOccurrenceOfADDigitTest {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        long theNumber = scanner.nextLong();
        System.out.println("Enter the digit");
        int theDigit = scanner.nextInt();
        int counter = 0;
        while (theNumber != 0) {
            long digit = theNumber % 10L;
            if (digit == theDigit) {
                counter++;
            }
            theNumber = theNumber / 10;
        }
        System.out.println("The number of times " + theDigit + " occurred is " + counter);
        scanner.close();
    }
}
