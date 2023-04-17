package org.kingshuk.corejava.recursion;



import java.util.Scanner;

public class SumOfNumbersTillNTest {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            System.out.println("Sum of the numbers till {} is {}", input, sum(input));
        }
    }
    
    private static int sum(int upperLimit){

    }
}
