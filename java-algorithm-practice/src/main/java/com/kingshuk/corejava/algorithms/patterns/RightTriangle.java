package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        System.out.println("How many numbers?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
