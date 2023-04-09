package org.kingshuk.corejava.stringprograms;

import java.util.Scanner;

public class CountNumberOfWordsTest {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.nextLine();
            int wordCount = 0;
            for (int i = 0; i < theSentence.length(); i++) {
                if (Character.isWhitespace(theSentence.charAt(i)) || theSentence.charAt(i) == '.') {
                    wordCount++;
                }
            }

            System.out.println("Number of words is: " + (wordCount+1));

            //Using split
            System.out.println("Number of words using split method is: "+theSentence.split(" ").length);
        }
    }
}
