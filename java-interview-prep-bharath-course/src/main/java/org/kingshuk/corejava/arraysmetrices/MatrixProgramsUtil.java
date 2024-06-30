package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

public class MatrixProgramsUtil {

    private MatrixProgramsUtil(){
        throw new UnsupportedOperationException("Utility class cannot be instantiated.");
    }

    public static int[][] buildMatrix(int[][] matrix,
                                      int rows1, int columns, Scanner scanner) {
        //Two for loops for rows and columns
        System.out.println("Enter the elements of the matrix1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int rows, int columns, int[][] resultMatrix) {
        //printing the result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean compareMatrices(int[][] initialMatrix, int[][] resultMatrix) {
        //printing the result matrix
        int length = initialMatrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(initialMatrix[i][j] != resultMatrix[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
