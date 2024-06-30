package org.kingshuk.corejava.arraysmetrices.assignments;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

public class PrintSecondaryDiagonalTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] theMatrix = buildMatrix(new int[rows][columns], rows, columns, scanner);

        System.out.println("The matrix is:");
        displayMatrix(rows, columns, theMatrix);

        int columnValue = columns - 1;

        System.out.println("The secondary diagonal is:");
        for (int i = 0; i < rows; i++) {
            System.out.println(theMatrix[i][columnValue] + " ");
            columnValue--;
        }
    }
}
