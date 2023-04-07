package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class PerfectNumberTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            int sum = 0;

            for(int i =1;i<=theNumber/2;i++){
                if(theNumber%i==0){
                    sum += i;
                }
            }

            System.out.println((sum == theNumber)
                    ? " A perfect number"
                    : "NOT a perfect number");

        }
    }
}
