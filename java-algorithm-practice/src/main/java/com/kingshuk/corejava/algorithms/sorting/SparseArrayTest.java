package com.kingshuk.corejava.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class ResultCount {
    private String queryString;
    private int count;
    private int order;

    public ResultCount(String queryString, int count, int order) {
        this.queryString = queryString;
        this.count = count;
        this.order = order;
    }

    public int getCount() {
        return count;
    }

    public int getOrder() {
        return order;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class SparseArrayResult {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    private static final Map<String, ResultCount> queryCount = new HashMap<>();

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        for (int i = 0; i < queries.size(); i++) {
            String queryString = queries.get(i);
            queryCount.put(queryString, new ResultCount(queryString, 0, i));
            for (String theString : strings) {
                if (queryString.equals(theString)) {
                    ResultCount resultCount = queryCount.get(queryString);
                    resultCount.setCount(resultCount.getCount() + 1);
                }
            }
        }

        return queryCount.values().stream()
                .sorted(Comparator.comparingInt(ResultCount::getOrder))
                .map(ResultCount::getCount)
                .collect(toList());
    }

}

public class SparseArrayTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = SparseArrayResult.matchingStrings(strings, queries);

        System.out.println(res);

        bufferedReader.close();
    }
}

