package com.kingshuk.corejava.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortPractice {

    public static void main(String[] args) {
        int[] rawArray = {554, 5645, 8, 45, 12, 100, 589};
        System.out.println("The Sorted Array is: " + Arrays.toString(performBubbleSort(rawArray)));
    }


    private static int[] performBubbleSort(int[] rawData) {
        int largerNumber;
        for (int i = 0; i < rawData.length; i++) {
            for (int j = 0; j < rawData.length; j++) {
                if (rawData[j] > rawData[i]) {
                    largerNumber = rawData[j];
                    rawData[j] = rawData[i];
                    rawData[i] = largerNumber;
                }
            }
        }
        return rawData;
    }
}
