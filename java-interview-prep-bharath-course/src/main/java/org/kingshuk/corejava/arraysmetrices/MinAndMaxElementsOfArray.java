package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * Given an array, find the min and max elements
 * In the array
 */
public class MinAndMaxElementsOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements of the array");

        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

//        int min = 2147483647;
//        int max = 0;
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < numberOfElements; i++) {
            if(array[i] < min){
                min = array[i];
            }

            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println("The minimum element is " + min);
        System.out.println("The maximum element is " + max);
    }
}
