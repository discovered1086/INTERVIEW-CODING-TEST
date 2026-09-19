package com.kingshuk.corejava.algorithms.patterns;

import java.util.Scanner;

public class RightTriangleMirror {

    public static void main(String[] args) {
        System.out.println("How many numbers for this mirror?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=number; j++) {
                if(j <= number - i){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
