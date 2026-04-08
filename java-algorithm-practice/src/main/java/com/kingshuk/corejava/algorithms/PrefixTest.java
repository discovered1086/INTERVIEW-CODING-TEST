package com.kingshuk.corejava.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixTest {

    public static void main(String[] args) {
        String [] words = {"flower","flow","flight"};

        System.out.println("Common prefix: " + longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        List<String> prefix = new ArrayList<>();

        //Find the longest String
        int shortestString = 999999999;

        for (String s : strs) {
            if (s.length() < shortestString) {
                shortestString = s.length();
                System.out.println(shortestString);
            }
        }

        //Keep iterating until the shortest string length for each string
        boolean prefixMatches = true;

        for (int i = 0; i < shortestString; i++) {
            char c = ' '; //f
            for (String str : strs) {
                if (c != ' ' && str.charAt(i) != c) {
                    prefixMatches = false;
                    break;
                } else {
                    c = str.charAt(i);  //l
                }
            }

            if(prefixMatches){
                prefix.add(String.valueOf(c));
            }else{
                break;
            }

            System.out.println(prefix);
        }

        if(prefixMatches){
            return prefix.stream()
                    .map(String::trim)
                    .collect(Collectors.joining(""));
        }else{
            return "";
        }

    }
}
