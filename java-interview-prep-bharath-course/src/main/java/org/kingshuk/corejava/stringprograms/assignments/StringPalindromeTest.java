package org.kingshuk.corejava.stringprograms.assignments;

import java.util.Scanner;

public class StringPalindromeTest {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theWord = scanner.next();

            String reverse = new StringBuilder(theWord).reverse().toString();

            System.out.println((reverse.equals(theWord)
                    ? " It is a Palindrome"
                    : "It is NOT a palindrome"));
        }
    }
}
