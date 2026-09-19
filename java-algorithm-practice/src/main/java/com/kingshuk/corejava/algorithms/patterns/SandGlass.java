package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class SandGlass {

    public static void main(String[] args) {
        System.out.println("What is the number of rows of the sand glass?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            printAllChars(i, number);

            System.out.println();
        }

        for (int i = number; i >=1; i--) {
            printAllChars(i, number);

            System.out.println();
        }

        sc.close();
    }

    private static void printAllChars(int i, int number) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= number - i +1; j++) {
            System.out.print("* ");
        }
    }
}
