package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class ArmstrongNumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            int actualNumber = theNumber;
            int sum = 0;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                sum = (int) (sum + Math.pow(digit, 3));
                theNumber = theNumber / 10;
            }

            System.out.println((sum == actualNumber)
                    ? " An Armstrong number"
                    : "NOT an Armstrong number");

        }
    }
}
