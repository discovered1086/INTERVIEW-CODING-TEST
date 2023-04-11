package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CountNumberOfWordsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountNumberOfWordsTest.class);

    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.next();
            int wordCount = 0;
            for (int i = 0; i < theSentence.length(); i++) {
                if (Character.isWhitespace(theSentence.charAt(i)) || theSentence.charAt(i) == '.') {
                    wordCount++;
                }
            }

            LOGGER.info("Number of words is: {}", (wordCount + 1));

            //Using split
            LOGGER.info("Number of words using split method is: {}", theSentence.split(" ").length);
        }
    }
}
