package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class SpecialNumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            //It's important to store the original number as it's going to change during the loop
            int actualNumber = theNumber;
            int sum = 0;
            int multiplication = 1;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                sum = sum + digit;
                multiplication = multiplication * digit;
                theNumber = theNumber / 10;
            }

            System.out.println((sum + multiplication == actualNumber)
                    ? " A special number"
                    : "NOT a special number");

        }
    }
}
