package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

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
        int[][] matrix1 = buildMatrix(new int[rows][columns], rows, columns, scanner);

        System.out.println("Second Matrix....");

        //Now we create the second matrix
        int[][] matrix2 = buildMatrix(new int[rows][columns], rows, columns, scanner);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The result matrix is:");
        displayMatrix(rows, columns, resultMatrix);
    }


}
