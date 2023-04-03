package com.kingshuk.corejava.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MinMaxResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    private static Integer [] sort(Integer [] numbersUnSorted){
        int largerNumber;
        for (int i = 0; i < numbersUnSorted.length; i++) {
            for (int j = 0; j < numbersUnSorted.length; j++) {
                if (numbersUnSorted[j] > numbersUnSorted[i]) {
                    largerNumber = numbersUnSorted[j];
                    numbersUnSorted[j] = numbersUnSorted[i];
                    numbersUnSorted[i] = largerNumber;
                }
            }
        }
        return numbersUnSorted;
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer[] sortedValues = sort(arr.toArray(new Integer[0]));
        System.out.println(List.of(sortedValues));

        Integer [] smallArray = Arrays.copyOfRange(sortedValues, 0,sortedValues.length-1);
        System.out.println(List.of(smallArray));
        Integer [] largerArray = Arrays.copyOfRange(sortedValues, 1, sortedValues.length);
        System.out.println(List.of(largerArray));

        long smallestSum = Arrays.stream(smallArray)
                .mapToLong(Integer::intValue)
                .sum();

        long largestSum = Arrays.stream(largerArray)
                .mapToLong(Integer::intValue)
                .sum();

        System.out.println(smallestSum);
        System.out.println(largestSum);
    }

}

public class MinMaxSumPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMaxResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}

