package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

public class SwapRowsMatrixTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] theMatrix = buildMatrix(new int[rows][columns], rows, columns, scanner);
        System.out.println("Rows to swap:");
        int rowToSwap = scanner.nextInt();
        int rowToSwapWith = scanner.nextInt();

        System.out.println("The matrix before swap is:");
        displayMatrix(rows, columns, theMatrix);

        int columnValueRow1 = 0;
        int columnValueRow2 = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == rowToSwap - 1) {
                    columnValueRow1 = theMatrix[i][j];
                    columnValueRow2 = theMatrix[rowToSwapWith - 1][j];
                    theMatrix[i][j] = columnValueRow2;
                    theMatrix[rowToSwapWith - 1][j] = columnValueRow1;
                }
            }
        }

        System.out.println("The result matrix after swap is:");
        displayMatrix(rows, columns, theMatrix);

    }
}
