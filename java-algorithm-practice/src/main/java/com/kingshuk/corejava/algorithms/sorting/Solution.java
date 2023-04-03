package com.kingshuk.corejava.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class NumberSeparator{
    private String description;
    private int theNumber;

    public NumberSeparator(String description, int number){
        this.description = description;
        this.theNumber=number;
    }

    public String getDescription(){
        return this.description;
    }

    public int getTheNumber(){
        return this.theNumber;
    }
}
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Map<String, List<NumberSeparator>> numberSeparated = arr.stream()
                .map(number -> {
                    if(number > 0){
                        return new NumberSeparator("Positive", number);
                    }else if(number <0){
                        return new NumberSeparator("Negative", number);
                    }else{
                        return new NumberSeparator("Zero", number);
                    }
                })
                .collect(Collectors.groupingBy(NumberSeparator::getDescription));
        float positiveRatio = 0;
        float negativeRatio = 0;
        float zeroRatio = 0;
        if(Objects.nonNull(numberSeparated.get("Positive"))){
            positiveRatio= (float) numberSeparated.get("Positive").size() / (float) arr.size();
        }

        if(Objects.nonNull(numberSeparated.get("Negative"))){
            negativeRatio= (float) numberSeparated.get("Negative").size() / (float) arr.size();
        }

        if(Objects.nonNull(numberSeparated.get("Zero"))){
            zeroRatio = (float) numberSeparated.get("Zero").size() / (float) arr.size();
        }

        NumberFormat df = DecimalFormat.getInstance();
        df.setMinimumFractionDigits(6);
        df.setMaximumFractionDigits(6);
        df.setRoundingMode(RoundingMode.DOWN);

        System.out.println(df.format(positiveRatio));
        System.out.println(df.format(negativeRatio));
        System.out.println(df.format(zeroRatio));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
