package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * Create and print a matrix based on the user input
 */
public class CreateAndPrintMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        //Now we create a two-dimensional array or a matrix
        int[][] matrix = new int[rows][columns];

        //Two for loops for rows and columns
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               matrix[i][j] = scanner.nextInt();
           }
        }

        System.out.println("The matrix is:");
        //printing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
