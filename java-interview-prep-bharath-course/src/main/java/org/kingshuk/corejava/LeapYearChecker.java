package org.kingshuk.corejava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class LeapYearChecker {
    private static final Logger LOGGER = LoggerFactory.getLogger(LeapYearChecker.class);

    public static void main(String[] args) {
//        LOGGER.info("Enter the year you want to check");
        System.out.println("Enter the year you want to check");
        try (Scanner scanner = new Scanner(System.in);) {
            int year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year ");
            }
        }

    }
}