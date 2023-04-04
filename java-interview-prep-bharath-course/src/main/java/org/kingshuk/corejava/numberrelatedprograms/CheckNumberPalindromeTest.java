package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class CheckNumberPalindromeTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            int theResult = 0;
            int theEnteredNumber = theNumber;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                theResult = theResult * 10 + digit;
                theNumber = theNumber / 10;
            }

            if (theEnteredNumber == theResult) {
                System.out.println("The number is a palindrome");
            } else {
                System.out.println("The number is NOT a palindrome");
            }
        }
    }
}
