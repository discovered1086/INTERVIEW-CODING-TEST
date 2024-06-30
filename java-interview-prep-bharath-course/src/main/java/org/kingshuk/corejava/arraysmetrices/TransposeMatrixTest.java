package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

public class TransposeMatrixTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] theMatrix = buildMatrix(new int[rows][columns], rows, columns, scanner);
        //Now we create a two-dimensional array or a matrix
        int[][] newMatrix = new int[rows][columns];
        System.out.println("The result matrix before swap is:");
        displayMatrix(rows, columns, theMatrix);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[i][j] = theMatrix[j][i];
            }
        }

        System.out.println("The result matrix after swap is:");
        displayMatrix(rows, columns, newMatrix);

    }
}
