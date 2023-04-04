package org.kingshuk.corejava.numberrelatedprograms.assignments;

import java.util.Scanner;

public class SumOfEvenOddDigitsInANumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int oddSum = 0;
            int evenSum = 0;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                theNumber = theNumber / 10;
            }
            System.out.println("Sum of even digits: " + evenSum);
            System.out.println("Sum of odd digits: " + oddSum);
        }
    }
}
