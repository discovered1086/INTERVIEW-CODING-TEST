package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * In an array print the elements that are greater
 * than the elements on the left as well as elements on the right
 * Mini peaks, as they are called
 */
public class MiniPeaksInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the elements of the array");

        //The idea here is that we need to exclude the first and the last
        //element for all considerations because they will never be a peak
        int[] array = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < numberOfElements-1; i++) {
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                System.out.println("This number "+ array[i] +" is a peak");
            }
        }
    }
}
