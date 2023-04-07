package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class PrimeNumbersInRangeDifferentAlgorithmTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the lower limit");
            int lowerRange = scanner.nextInt();
            System.out.println("Enter the upper limit");
            int upperRange = scanner.nextInt();

            for (int i = lowerRange; i <= upperRange; i++) {
                int count = 0;
                if (i == 1) {
                    continue;
                }
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.println(i);
                }
            }


        }
    }
}
