package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * If we're given a set of character we have to duplicate each
 *  character
 *  like if we're given aba
 *  We have to produce aabbaa
 */
public class CharacterDuplicator {
    private static final Logger LOGGER = LoggerFactory.getLogger(CharacterDuplicator.class);
    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theChars = scanner.nextLine();
            char [] theCharacters = theChars.toCharArray();
            StringBuilder result = new StringBuilder();
            for(char c: theCharacters){
                result.append(c).append(c);
            }

            LOGGER.info("\nThe duplicated string is \n{}", result);
        }
    }
}
