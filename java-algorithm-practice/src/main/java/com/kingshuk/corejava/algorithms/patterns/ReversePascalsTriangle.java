package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class ReversePascalsTriangle {

    public static void main(String[] args) {
        System.out.println("What is the number of rows of the triangle?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number * 2 - 1; i++) {
            if (i <= number) {
                for (int j = 1; j <= number; j++) {
                    if (j <= number - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int j = 1; j <= number; j++) {
                    if (j <= i - number) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
