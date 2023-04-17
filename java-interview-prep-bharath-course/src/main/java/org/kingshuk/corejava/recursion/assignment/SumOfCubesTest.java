package org.kingshuk.corejava.recursion.assignment;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.Scanner;

@Slf4j
public class SumOfCubesTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the number");
            int number = scanner.nextInt();
            log.info("The sum of cubes until {} is {}", number, calculateCube(number));
        }
    }

    private static BigInteger calculateCube(int number) {
        if (number == 1) {
            return BigInteger.valueOf(number);
        } else {
            return BigInteger.valueOf((long) Math.pow(number, 3)).add(calculateCube(number - 1));
        }
    }
}
