package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ReplaceWithNextCharacter {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReplaceWithNextCharacter.class);

    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String chars = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for(char character: chars.toCharArray()){
                builder.append((char) (character+1));
            }

            LOGGER.info("The result character set is: \n{}", builder);
        }
    }
}
