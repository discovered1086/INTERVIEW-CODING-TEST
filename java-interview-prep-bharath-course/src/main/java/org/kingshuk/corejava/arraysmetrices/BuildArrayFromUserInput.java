package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * This is a simple program to just read user's input from the
 * console and then build an array with the input.
 */
public class BuildArrayFromUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];

        System.out.println("Enter the elements of the array");

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nPrinting the array now \n");

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
