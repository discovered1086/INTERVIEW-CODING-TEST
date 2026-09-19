package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class RightTriangleVariationReverse {

    public static void main(String[] args) {
        System.out.println("How many numbers for this reverse triangle?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
