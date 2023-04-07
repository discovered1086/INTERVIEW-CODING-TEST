package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class PrimeNumbersInRangeTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the lower limit");
            int lowerRange = scanner.nextInt();
            System.out.println("Enter the upper limit");
            int upperRange = scanner.nextInt();

            for (int i = lowerRange; i <= upperRange; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.println(i);
                }
            }


        }
    }
}
