package com.kingshuk.corejava.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortImplementation {

    public static void main(String[] args) {
        int[] rawArray = {5645, 554, 8, 45, 12, 100, 589};
        System.out.println("The Sorted Array is: " + Arrays.toString(performBubbleSort(rawArray)));
    }

    private static int[] performBubbleSort(int[] rawArray) {
        int counter = 0;
        //We'll compare one element with the entire rest of the elements and place it correctly
        for (int i = 0; i < rawArray.length; i++) {
            for (int j = 0; j < rawArray.length - 1; j++) {
                counter++;
                int temp;
                if (rawArray[j] > rawArray[j + 1]) {  //'i' is bubbling the large number to the right
                    temp = rawArray[j];
                    rawArray[j] = rawArray[j + 1];
                    rawArray[j + 1] = temp;
                }
                System.out.println("Loop number: i -> " + i + ", j -> " + j + " --->" + Arrays.toString(rawArray));
            }
        }
        System.out.println("Total number of loops: " + counter);
        return rawArray;
    }
}
