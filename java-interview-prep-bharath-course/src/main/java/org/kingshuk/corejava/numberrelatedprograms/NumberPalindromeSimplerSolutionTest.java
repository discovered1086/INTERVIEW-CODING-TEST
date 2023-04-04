package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class NumberPalindromeSimplerSolutionTest {
    /*
        Easy way to check using Java String API
     */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            String theNumber = scanner.next();
            StringBuilder buffer = new StringBuilder(theNumber);
            String reversedNumber = buffer.reverse().toString();

            System.out.println(reversedNumber.equals(theNumber)?" The number is a palindrome"
                    : " The number is NOT a palindrome");
        }
    }
}
