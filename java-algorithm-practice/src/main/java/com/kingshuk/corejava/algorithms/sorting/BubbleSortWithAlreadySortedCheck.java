package com.kingshuk.corejava.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortWithAlreadySortedCheck {

    public static void main(String[] args) {
//        int[] rawArray = {5645, 554, 8, 45, 12, 100, 589};
        int[] rawArray = {8, 12, 45, 100, 554, 589, 5645};
        System.out.println("The Sorted Array is: " + Arrays.toString(performBubbleSort(rawArray)));
    }

    private static int[] performBubbleSort(int[] rawArray) {
        int counter = 0;
        //We'll compare one element with the entire rest of the elements and place it correctly
        //Since the largest number has been bubbled up to the right end, we don't need to
        //include that element in the iteration of the 'j' loop

        //if after one iteration of the 'i' loop, no swapping was done
        //That would indicate the array is already sorted
        boolean swapped = false;
        for (int i = 0; i < rawArray.length; i++) {
            for (int j = 0; j < rawArray.length - 1 - i; j++) {
                counter++;
                int temp;
                if (rawArray[j] > rawArray[j + 1]) {  //'i' is bubbling the large number to the right
                    temp = rawArray[j];
                    rawArray[j] = rawArray[j + 1];
                    rawArray[j + 1] = temp;
                    swapped = true;
                }
                System.out.println("Loop number: i -> " + i + ", j -> " + j + " --->" + Arrays.toString(rawArray));
            }

            if(i==0 && !swapped){
                System.out.println("Array is already sorted");
                break;
            }
        }
        System.out.println("Total number of loops: " + counter);
        return rawArray;
    }
}
