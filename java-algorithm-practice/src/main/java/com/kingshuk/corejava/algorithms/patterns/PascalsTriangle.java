package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("What is the number of rows of the triangle?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number*2 - 1; i++) {
            if(i <= number){
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }else{
                for (int j = 1; j <= number*2 - i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
