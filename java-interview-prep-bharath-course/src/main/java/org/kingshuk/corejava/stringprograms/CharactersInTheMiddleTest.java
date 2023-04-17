package org.kingshuk.corejava.stringprograms;



import java.util.Scanner;

/**
 * Here we're trying to find the character(s)
 * that are in the middle of the string
 * Note: If the length of the string is even then
 * there will be two characters in the middle of the string
 */
public class CharactersInTheMiddleTest {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String output;
            int indexOfMiddle = input.length() / 2;
//            if (input.length() % 2 == 0) {
//                int index = input.length() / 2;
//                output += input.charAt(index-1);
//                output+= input.charAt(index);
//            } else {
//                output += input.charAt((input.length() / 2));
//            }
            //Using substring
            if (input.length() % 2 == 0) {
                output = input.substring(indexOfMiddle-1, indexOfMiddle+1);
            } else {
                output = input.substring(indexOfMiddle, indexOfMiddle+1);
            }

            System.out.println("\n The middle character(s) is/are: {}", output);
        }
    }
}
