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
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class FlippingResult {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        String binaryString = Long.toBinaryString(n);
        StringBuilder thirtyTwoBit = new StringBuilder();
        if(binaryString.length() < 32){
            int difference = 32 - binaryString.length();
            thirtyTwoBit.append("0".repeat(difference).concat(binaryString));
        }else{
            thirtyTwoBit.append(binaryString);
        }
        char [] bits = thirtyTwoBit.toString().toCharArray();

        char [] result = new char[bits.length];
        for(int i =0; i<bits.length; i++){
            char c = bits[i];

            if(c=='1'){
                result[i] = '0';
            }else{
                result[i] = '1';
            }
        }

        String resultString = new String (result);

        System.out.println(resultString);

        return new BigInteger(resultString, 2).longValue();


    }

}

public class FlippingBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = FlippingResult.flippingBits(n);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

