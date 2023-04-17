package org.kingshuk.corejava.recursion;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.Scanner;

@Slf4j
public class PowerCalculationTest {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the base");
            int base = scanner.nextInt();
            log.info("Enter the exponent");
            int exponent = scanner.nextInt();
            log.info("Base is {}, exponent is {}, result is {}", base, exponent, calculatePower(base, exponent));
        }
    }

    private static BigInteger calculatePower(int base, int exponent) {
        if (exponent == 1) {
            return BigInteger.valueOf(base);
        } else {
            return BigInteger.valueOf(base).multiply(calculatePower(base, exponent - 1));
        }
    }
}
