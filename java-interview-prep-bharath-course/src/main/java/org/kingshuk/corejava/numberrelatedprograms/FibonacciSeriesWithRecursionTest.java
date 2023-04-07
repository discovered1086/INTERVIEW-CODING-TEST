package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesWithRecursionTest {

    private static int fibonacciNumber(int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfElements = scanner.nextInt();
            int[] fibonacciSeries = new int[numberOfElements];

            for (int i = 0; i < numberOfElements; i++) {
                fibonacciSeries[i] = fibonacciNumber(i);
            }

            System.out.println("The fibonacci series is: " + Arrays.toString(fibonacciSeries));
        }
    }
}
