package org.kingshuk.corejava.stringprograms;



import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import java.util.Scanner;

/**
 * This program checks if a given string
 * has the same character in at least two consecutive positions
 * e.g. abghjhjhjjghyr
 * here 'jj' is there so the string indeed has duplicate consecutive
 * characters
 */
@Slf4j
public class DuplicateConsecutiveCharacterTest {

    public static void main(String[] args) {
       log.info("Enter the String");
        boolean duplicateConsecutiveCharacter = false;
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1)) {
                    duplicateConsecutiveCharacter = true;
                    break;
                }
            }

           log.info("\nDuplicate consecutive characters are {}", (duplicateConsecutiveCharacter) ? "present" : "not present");
        }
    }
}
