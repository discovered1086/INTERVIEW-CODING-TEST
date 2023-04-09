package org.kingshuk.corejava.numberrelatedprograms.assignments;

public class AllTwoDigitSpecialNumberTest {

    public static void main(String[] args) {
        System.out.println("Starting to loop through the numbers...");
        for (int i = 10; i < 100; i++) {
            int sum = 0;
            int multiplication = 1;
            int theNumber = i;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                sum = sum + digit;
                multiplication = multiplication * digit;
                theNumber = theNumber / 10;
            }

            System.out.println("The number: " + i + " is " + ((sum + multiplication == i)
                    ? "a special number"
                    : "NOT a special number"));
        }
    }
}
