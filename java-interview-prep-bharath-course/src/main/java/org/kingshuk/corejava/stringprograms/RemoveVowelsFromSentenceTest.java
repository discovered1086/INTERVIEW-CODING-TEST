package org.kingshuk.corejava.stringprograms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class RemoveVowelsFromSentenceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RemoveVowelsFromSentenceTest.class);

    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.nextLine();

            //With basic logic
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < theSentence.length(); i++) {
                boolean isVowel = false;
                char charAt = theSentence.charAt(i);
                for (char vowel : vowels) {
                    isVowel = Character.toLowerCase(charAt) == vowel;
                    if (isVowel) {
                        break;
                    }
                }

                if (!isVowel) {
                    builder.append(charAt);
                }
            }
            LOGGER.info("The sentence after removing the vowels is: \n {}", builder);

            //With in-built string functions
            String replacedSentence = theSentence.toLowerCase().replaceAll("[aeiou]", "");
            LOGGER.info("The sentence after removing the vowels with in-built functions is: \n {}", replacedSentence);


        }
    }
}
