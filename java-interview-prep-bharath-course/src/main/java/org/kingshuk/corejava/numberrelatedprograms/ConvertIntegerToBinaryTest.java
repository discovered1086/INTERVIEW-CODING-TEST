package org.kingshuk.corejava.numberrelatedprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertIntegerToBinaryTest {
    /*
        Here's the logic for this one

        The number: 9

        divide the quotient by 2 and store the remainder and keep dividing the quotient by 2

        We keep doing this until the quotient is 0

        Quotient                        remainder
        9/2 = 4                            9%2 = 1
        4/2 = 2                            4%2 = 0
        2/2 = 1                            2%2 = 0
        1/2 = 0                            1%2 = 1

        We have the binary 1001 (reversed from the bottom)
    */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scanner = new Scanner(System.in)) {
            int theNumber = scanner.nextInt();
            int [] binary = new int[100];
            int index = 0;
            while(theNumber!=0){
                binary[index] = theNumber % 2;
                theNumber = theNumber /2;
                index++;
            }

            Arrays.stream(Arrays.copyOfRange(binary, 0, index)).sequential()
                    .forEach(System.out::print);

        }
    }
}
