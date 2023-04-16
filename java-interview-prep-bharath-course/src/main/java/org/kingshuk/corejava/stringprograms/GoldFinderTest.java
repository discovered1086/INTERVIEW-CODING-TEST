package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Search if a sentence has the word 'gold' in it
 */
public class GoldFinderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoldFinderTest.class);

    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.nextLine();
            String lowerCaseSentence = theSentence.toLowerCase();
            String searchString = "gold";
            boolean matchFound = false;

            for (int i = 0; i < lowerCaseSentence.length(); i++) {
                int k = i;
                int charactersMatched = 0;
                for (int j = 0; j < searchString.length(); j++) {
                    if (lowerCaseSentence.charAt(k) == searchString.charAt(j)) {
                        charactersMatched++;
                    }
                    /*
                        k is the index that will check next 4 characters of the sentence for matching
                        So we need to make sure k is always smaller than the length of the sentence
                        because k always starts at the character in the given sentence i.e k=i
                    */
                    if (k < lowerCaseSentence.length() - 1) {
                        k++;
                    }
                }

                if (charactersMatched == searchString.length()) {
                    matchFound = true;
                    break;
                }
            }

            LOGGER.info(matchFound ? "The sentence has gold in it" : "The sentence has no gold in it");

        }
    }
}
