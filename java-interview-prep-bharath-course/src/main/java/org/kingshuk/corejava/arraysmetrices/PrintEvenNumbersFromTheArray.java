package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * This is a simple program to read user's input
 * and calculate the sum of all the even numbers from an array
 */
public class PrintEvenNumbersFromTheArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < numberOfElements; i++) {
            int enteredNumber = scanner.nextInt();
            if (enteredNumber % 2 == 0) {
                sum += enteredNumber;
            }
        }

        System.out.println("The sum of the even numbers is: " + sum);
        scanner.close();
    }
}
