package org.kingshuk.corejava.arraysmetrices;

import java.util.Scanner;

import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.buildMatrix;
import static org.kingshuk.corejava.arraysmetrices.MatrixProgramsUtil.displayMatrix;

public class SparseMatrixTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();
        int[][] theMatrix = buildMatrix(new int[rows][columns], rows, columns, scanner);

        int zeroCount =0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (theMatrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        displayMatrix(rows, columns, theMatrix);

        int numberOfElements = rows * columns;
        System.out.println("The number of elements in the matrix is " + numberOfElements);
        System.out.println("The number of zeros in the matrix is " + zeroCount);
        if(zeroCount > numberOfElements/2){
            System.out.println("It is a sparse matrix");
        }else{
            System.out.println("It is not a sparse matrix");
        }
    }
}
