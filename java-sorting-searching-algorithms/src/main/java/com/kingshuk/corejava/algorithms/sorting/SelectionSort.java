package com.kingshuk.corejava.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    static void main() {
        int[] rawArray = {5645, 554, 8, 45, 12, 100, 589};
        System.out.println("The Sorted Array is: " + Arrays.toString(performSelectionSort(rawArray)));
    }

    private static int[] performSelectionSort(int[] rawArray) {
        int minIndex;
        int temp;
        int size = rawArray.length;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rawArray[j] < rawArray[minIndex]) {
                    minIndex = j;
                }
            }

            temp = rawArray[minIndex];
            rawArray[minIndex] = rawArray[i];
            rawArray[i] = temp;
        }

        return rawArray;
    }
}
