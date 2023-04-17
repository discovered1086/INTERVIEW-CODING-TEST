package org.kingshuk.corejava.recursion;



import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class SumOfNumbersTillNTest {
    public static void main(String[] args) {
        log.info("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            log.info("Sum of the numbers till {} is {}", input, sum(input));
        }
    }
    
    private static int sum(int number){
        //exit condition
        if(number == 1){
            return number;
        }else{
            return number + sum(number-1);
        }
    }
}
