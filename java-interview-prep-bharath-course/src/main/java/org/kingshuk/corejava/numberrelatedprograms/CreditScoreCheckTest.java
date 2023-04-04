package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Scanner;

public class CreditScoreCheckTest {

    public static void main(String[] args) {
        System.out.println("Enter the credit score");
        try (Scanner scanner = new Scanner(System.in);) {
            int score = scanner.nextInt();
            if (score < 400 || score > 850) {
                throw new IllegalArgumentException("Invalid credit score provided");
            }

            if (score <= 599) {
                System.out.println("Silver card issued");
            } else if (score >= 600 && score <= 799) {
                System.out.println("Gold card issued");
            } else {
                System.out.println("Platinum card issued");
            }
        }
    }
}
