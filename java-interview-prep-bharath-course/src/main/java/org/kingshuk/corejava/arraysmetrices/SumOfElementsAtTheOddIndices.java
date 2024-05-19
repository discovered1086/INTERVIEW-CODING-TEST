package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * Given an array, calculate the sum of all odd indices
 */
public class SumOfElementsAtTheOddIndices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements of the array");

        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }

        System.out.println("The sum of the elements of the array is: " + sum);
    }
}
