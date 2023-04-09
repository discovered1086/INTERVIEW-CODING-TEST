package org.kingshuk.corejava.stringprograms;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner scanner = new Scanner(System.in)) {
            String theWord = scanner.nextLine();

            char[] charsNew = new char[theWord.length()];

            for (int i = theWord.length() - 1; i >= 0; i--) {
                charsNew[i] = theWord.charAt(theWord.length() - 1 - i);
            }

            System.out.println("Using char array: " + new String(charsNew));

            /*
                Instead of doing all this, we can just use a string buffer
             */
            System.out.println("Using String buffer: "+ new StringBuilder(theWord).reverse());
        }
    }
}
