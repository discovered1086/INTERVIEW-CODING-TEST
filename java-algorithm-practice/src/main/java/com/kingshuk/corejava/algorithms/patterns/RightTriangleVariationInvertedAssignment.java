package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class RightTriangleVariationInvertedAssignment {

    public static void main(String[] args) {
        System.out.println("How many numbers for this inverted triangle assignment?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
