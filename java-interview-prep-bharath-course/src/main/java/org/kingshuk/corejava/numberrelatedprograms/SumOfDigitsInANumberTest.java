package org.kingshuk.corejava.numberrelatedprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigitsInANumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            int sum = 0;
            while (theNumber != 0) {
                sum = sum + theNumber % 10;
                theNumber = theNumber / 10;
            }
            System.out.println(sum);
        }
    }
}
