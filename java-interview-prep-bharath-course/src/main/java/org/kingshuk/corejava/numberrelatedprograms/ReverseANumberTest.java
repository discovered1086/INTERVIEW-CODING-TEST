package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseANumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int[] theDigits = new int[100];
            int i = 0;
            int numberOfDigits = 0;
            int theResult = 0;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                theDigits[i] = digit;
                numberOfDigits++;
                theNumber = theNumber / 10;
                i++;
            }

            int[] copyOfRange = Arrays.copyOfRange(theDigits, 0, numberOfDigits);
            for (int j = 0; j < copyOfRange.length; j++) {
                int exponent = (copyOfRange.length-1) - j ;
                theResult = (int) (theResult + (copyOfRange[j] * Math.pow(10, exponent)));
            }

            System.out.println("The reversed number is: " + theResult);
        }
    }
}
