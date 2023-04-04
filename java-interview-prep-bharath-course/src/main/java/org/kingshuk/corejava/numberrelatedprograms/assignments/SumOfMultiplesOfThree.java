package org.kingshuk.corejava.numberrelatedprograms.assignments;

import java.util.Scanner;

public class SumOfMultiplesOfThree {

    /*
    Calculate the sum of all the prime digits within a number
    Only prime digits between 0-9 are 2,3,5,7
     */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int sum = 0;
            while (theNumber != 0) {
                int digit = theNumber % 10;
                if (digit % 3 == 0) {
                    sum += digit;
                }
                theNumber = theNumber / 10;
            }
            System.out.println("Sum of digits multiple of 3 is: " + sum);
        }
    }
}
