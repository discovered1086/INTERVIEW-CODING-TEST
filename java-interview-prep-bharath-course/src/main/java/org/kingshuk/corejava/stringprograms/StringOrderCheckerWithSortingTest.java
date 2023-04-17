package org.kingshuk.corejava.stringprograms;



import java.util.Arrays;
import java.util.Scanner;

/**
 * What we are doing here is that given a string
 * We need to determine if their characters are in order of the alphabet or not
 */
public class StringOrderCheckerWithSortingTest {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        boolean areCharsInOrder = true;
        try (Scanner scanner = new Scanner(System.in)) {
            String chars = scanner.nextLine();
            /*
                The logic here is to sort the characters
                and then check if the sorted characters and the
                original characters are same or not
             */
            char[] charArray = chars.toCharArray();
            Arrays.sort(charArray);
            areCharsInOrder = new String(charArray).equals(chars);


            System.out.println("\nCharacters in the string are {} order", (areCharsInOrder)?"in":"not in");
        }
    }
}
