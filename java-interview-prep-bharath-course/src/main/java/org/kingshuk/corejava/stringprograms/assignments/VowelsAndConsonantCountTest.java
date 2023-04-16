package org.kingshuk.corejava.stringprograms.assignments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class VowelsAndConsonantCountTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(VowelsAndConsonantCountTest.class);

    public static void main(String[] args) {
        LOGGER.info("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theSentence = scanner.nextLine();
            int vowelCount = 0;
            int consonantCount = 0;
            //With basic logic
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};

            for (int i = 0; i < theSentence.length(); i++) {
                boolean isVowel = false;
                char charAt = theSentence.charAt(i);
                for (char vowel : vowels) {
                    //If match found, update the flag and break
                    if (Character.toLowerCase(charAt) == vowel) {
                        isVowel = true;
                        break;
                    }
                }

                if (isVowel) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            LOGGER.info("\nThe no of vowels is {} \nThe number of consonants is {}", vowelCount, consonantCount);
        }
    }
}
