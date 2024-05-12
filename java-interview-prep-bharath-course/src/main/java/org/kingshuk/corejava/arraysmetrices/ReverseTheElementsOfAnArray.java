package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * This is a simple program to reverse the elements of
 * An array of elements provided by the user
 */
public class ReverseTheElementsOfAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements of the array");

        int[] array = new int[numberOfElements];
        int[] reversedArray = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfElements; i++) {
            reversedArray[numberOfElements - 1 - i] = array[i];
        }

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        scanner.close();
    }
}
