package com.stackroute.pe3;

public class ChessBoardInArray {
    public static void main(String args[])
    {   String[][] array=new String[8][8];//create an array in rows and colums as 8
        for(int i=0;i<8;i++)//for executing rows
        {
            for(int j=0;j<8;j++)//for executing columns
            {
                if((i+j)%2==0)//if the addition of i and j is even print WW
                {   array[i][j]="WW";
                    System.out.print(array[i][j]+" | ");
                }
                else //if the addition is odd print BB
                {
                    array[i][j]="BB";
                    System.out.print(array[i][j]+" | ");
                }
            }
            System.out.println();//New line for starting a new row
        }
    }
}
