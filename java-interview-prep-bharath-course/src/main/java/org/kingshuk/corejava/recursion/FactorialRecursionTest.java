package org.kingshuk.corejava.recursion;



import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class FactorialRecursionTest {

    public static void main(String[] args) {
       log.info("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
           log.info("The factorial of {} is {}", input, factorialCalculator(input));
        }
    }

    private static int factorialCalculator(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorialCalculator(number - 1);
        }
    }
}
