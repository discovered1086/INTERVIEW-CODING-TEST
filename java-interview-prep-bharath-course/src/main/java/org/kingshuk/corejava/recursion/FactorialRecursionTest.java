package org.kingshuk.corejava.recursion;



import java.util.Scanner;

public class FactorialRecursionTest {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            System.out.println("The factorial of {} is {}", input, factorialCalculator(input));
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
