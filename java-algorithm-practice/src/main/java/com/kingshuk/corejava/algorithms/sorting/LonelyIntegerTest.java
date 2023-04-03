package com.kingshuk.corejava.algorithms.sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class LonelyIntegerResult {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> numberOfOccurances = new HashMap<>();
        for(Integer number: a){
            if(Objects.isNull(numberOfOccurances.get(number))){
                numberOfOccurances.put(number, 1);
            }else{
                numberOfOccurances.put(number, numberOfOccurances.get(number)+1);
            }
        }

        AtomicInteger lonelyNumber = new AtomicInteger(0);

        numberOfOccurances.forEach((key, value) -> {
            if (value == 1) {
                lonelyNumber.set(key);
            }
        });

        return lonelyNumber.get();

    }

}

public class LonelyIntegerTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = LonelyIntegerResult.lonelyInteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
