package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class CountNumberOfDigitsTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int count = 0;
            while (theNumber != 0) {
                theNumber = theNumber / 10;
                count++;
            }

            System.out.println("Number of digits in a number is: " + count);
        }
    }
}
