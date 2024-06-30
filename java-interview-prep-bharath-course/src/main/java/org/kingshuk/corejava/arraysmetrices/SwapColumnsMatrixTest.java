package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

public class SwapColumnsMatrixTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] theMatrix = buildMatrix(new int[rows][columns], rows, columns, scanner);
        System.out.println("Rows to swap:");
        int columnToSwap = scanner.nextInt();
        int columnToSwapWith = scanner.nextInt();

        System.out.println("The matrix before swap is:");
        displayMatrix(rows, columns, theMatrix);

        int rowValueColumn1 = 0;
        int rowValueColumn2 = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == columnToSwap - 1) {
                    rowValueColumn1 = theMatrix[i][j];
                    rowValueColumn2 = theMatrix[i][columnToSwapWith - 1];
                    theMatrix[i][j] = rowValueColumn2;
                    theMatrix[i][columnToSwapWith - 1] = rowValueColumn1;
                }
            }
        }

        System.out.println("The result matrix after swap is:");
        displayMatrix(rows, columns, theMatrix);

    }
}
