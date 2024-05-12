package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * This is a simple program to read user's input
 * and calculate the sum of all the even numbers from an array
 */
public class SumOfPositiveAndNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        int positiveSum = 0;
        int negativeSum = 0;
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < numberOfElements; i++) {
            int enteredNumber = scanner.nextInt();
            if(enteredNumber >= 0){
                positiveSum += enteredNumber;
            }else{
                negativeSum += enteredNumber;
            }
        }

        System.out.println("The sum of the positive numbers is: " + positiveSum);
        System.out.println("The sum of the negative numbers is: " + negativeSum);
        scanner.close();
    }
}
