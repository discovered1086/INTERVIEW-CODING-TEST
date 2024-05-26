package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

/**
 * Create the sum of two matrices
 */
public class FindSumOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Matrix....");
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] resultMatrix = new int[rows][columns];
        //Now we create a two-dimensional array or a matrix1
        int[][] matrix1 = getMatrix1(new int[rows][columns], rows, columns, scanner);

        System.out.println("Second Matrix....");

        //Now we create the second matrix
        int[][] matrix2 = getMatrix1(new int[rows][columns], rows, columns, scanner);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The result matrix is:");
        //printing the result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix1(int[][] matrix, int rows1, int columns, Scanner scanner) {
        //Two for loops for rows and columns
        System.out.println("Enter the elements of the matrix1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
