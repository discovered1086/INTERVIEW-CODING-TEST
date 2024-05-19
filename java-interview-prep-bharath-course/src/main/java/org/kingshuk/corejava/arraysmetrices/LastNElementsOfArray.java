package org.kingshuk.corejava.arraysmetrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array, print the last n
 * elements of an array as provided by the user
 * if the user says print last 3, we need to print last 3 etc.
 */
public class LastNElementsOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements of the array");

        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter last n elements of the array");
        int lastNElements = scanner.nextInt();

        int[] lastNElementsOfArray = new int[lastNElements];

        int nthIndex = numberOfElements - lastNElements;

        int index = 0;
        for (int i = nthIndex; i < numberOfElements; i++) {
            lastNElementsOfArray[index] = array[i];
            index++;
        }

        System.out.println("The last " + lastNElements + " elements of the array are "
                + Arrays.toString(lastNElementsOfArray));
    }
}
