package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfElements = scanner.nextInt();
            int[] fibonacciSeries = new int[numberOfElements];
            fibonacciSeries[0] = 0;
            fibonacciSeries[1] = 1;
            for (int i = 2; i < numberOfElements; i++) {
                fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
            }

            System.out.println("The fibonacci series is: "+ Arrays.toString(fibonacciSeries));
        }
    }
}
