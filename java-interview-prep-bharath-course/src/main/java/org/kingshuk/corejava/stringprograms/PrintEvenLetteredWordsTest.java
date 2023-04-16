package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The objective here is to take a sentence as an input
 * And print the words which have even-numbered letters
 */

public class PrintEvenLetteredWordsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintEvenLetteredWordsTest.class);

    @SuppressWarnings("java:S125")
    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.nextLine();

/*
            String[] words = theSentence.split(" ");

            for (String word : words) {
                if (word.length() % 2 == 0) {
                    LOGGER.info(word);
                }
            }
*/

            StringTokenizer tokenizer = new StringTokenizer(theSentence, " ");

            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
                if (word.length() % 2 == 0) {
                    LOGGER.info(word);
                }
            }
        }
    }
}
