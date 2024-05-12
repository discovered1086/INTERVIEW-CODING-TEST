package org.kingshuk.corejava.stringprograms;

import java.util.Scanner;

public class MaxOccurrenceOfCharacterTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String theString = scanner.next();

        int[] charHolder = new int[256];

        for (int i = 0; i < theString.length(); i++) {
            charHolder[theString.charAt(i)]++;
        }

        int max = 0;
        for (int j = 0; j < charHolder.length; j++) {
            if (charHolder[j] > charHolder[max]) {
                max = j;
            }
        }

        System.out.println("The most occurring character is: " + (char) max);
    }
}
