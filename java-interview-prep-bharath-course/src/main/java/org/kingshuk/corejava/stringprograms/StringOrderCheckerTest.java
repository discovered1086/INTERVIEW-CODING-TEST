package org.kingshuk.corejava.stringprograms;



import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * What we are doing here is that given a string
 * We need to determine if their characters are in order of the alphabet or not
 */

@Slf4j
public class StringOrderCheckerTest {

    public static void main(String[] args) {
       log.info("Enter the String");
        boolean areCharsInOrder = true;
        try (Scanner scanner = new Scanner(System.in)) {
            String chars = scanner.nextLine();
            /*
                The logic here is to check if
                current character = previous character + 1
                if not then we break and exit the loop
             */
            for (int i = 1; i < chars.length(); i++) {
                if(chars.charAt(i) != (chars.charAt(i-1)+1)){
                    areCharsInOrder = false;
                    break;
                }
            }

           log.info("\nCharacters in the string are {} order", (areCharsInOrder)?"in":"not in");
        }
    }
}
