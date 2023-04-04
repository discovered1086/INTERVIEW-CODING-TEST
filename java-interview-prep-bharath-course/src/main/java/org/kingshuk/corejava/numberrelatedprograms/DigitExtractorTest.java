package org.kingshuk.corejava.numberrelatedprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitExtractorTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in);) {
            int theNumber = scanner.nextInt();
            List<Integer> digits = new ArrayList<>();
            while (theNumber != 0) {
                digits.add(theNumber % 10);
                theNumber = theNumber / 10;
            }
            System.out.println(digits);
        }
    }
}
