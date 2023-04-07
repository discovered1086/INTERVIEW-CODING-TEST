package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class NivenNumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            //It's important to store the original number as it's going to change during the loop
            int actualNumber = theNumber;
            int sum = 0;
            while (theNumber != 0) {
                sum = sum + theNumber % 10;
                theNumber = theNumber / 10;
            }

            System.out.println("The number is " + ((sum !=0 && (actualNumber % sum == 0))
                    ? " a niven number"
                    : " is NOT a niven number"));

        }
    }
}
