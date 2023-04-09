package org.kingshuk.corejava.stringprograms;

import java.util.Scanner;

public class StringEndsWithAnotherStringTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String theString = scanner.next();
        System.out.println("Enter the second String");
        String searchString = scanner.next();

        System.out.println("The given String" +
                ((theString.endsWith(searchString))
                        ? " ends with the search string"
                        : " does NOT end with the search string"));

        //Using another method

        System.out.println("=".repeat(25));

        String substring = theString.substring(theString.length() - searchString.length());

        System.out.println("The given String" +
                (substring.equals(searchString)
                        ? " ends with the search string"
                        : " does NOT end with the search string"));


        //Using basic logic
        System.out.println("=".repeat(25));

        boolean doesEndWith = false;

        int searchIndex = searchString.length()-1;
        for (int i = theString.length() - 1; i > (theString.length()-searchString.length()); i--) {
                doesEndWith = theString.charAt(i) == searchString.charAt(searchIndex);
                searchIndex--;

        }

        System.out.println("The given String" +
                (doesEndWith
                        ? " ends with the search string"
                        : " does NOT end with the search string"));

        //Using another basic logic
        System.out.println("=".repeat(25));

        boolean doesEndWith2 = false;

        for(int i= theString.length()-1, j = searchString.length()-1;j>=0;j--, i--){
            doesEndWith2 = theString.charAt(i) == searchString.charAt(j);
        }

        System.out.println("The given String" +
                (doesEndWith2
                        ? " ends with the search string"
                        : " does NOT end with the search string"));

        scanner.close();
    }
}
