/*Addition of multidimensional array*/
package com.stackroute.pe3;
import java.util.*;
public class AdditionOfTwoMatrix {
    public static void main(String args[])
    {
        int rows, columns, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        rows = in.nextInt();
        System.out.println("Input number of columns of matrix");
        columns  = in.nextInt();

        int first[][] = new int[rows][columns];
        int second[][] = new int[rows][columns];
        int sum[][] = new int[rows][columns];

        System.out.println("Input elements of first matrix");

        for (i = 0; i < rows; i++)
            for (j = 0; j < columns; j++)
                first[i][j] = in.nextInt();

        System.out.println("Input elements of second matrix");

        for (i = 0 ; i < rows ; i++)
            for (j = 0 ; j < columns ; j++)
                second[i][j] = in.nextInt();

        for (i = 0; i < rows; i++)
            for (j = 0; j < columns; j++)
                sum[i][j] = first[i][j] + second[i][j];

        System.out.println("Sum of the matrices:");

        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }
    }
}
