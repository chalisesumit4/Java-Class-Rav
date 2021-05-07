package com.otherProg;

import java.util.Scanner;

public class test {

    public static int[][] arr(int row, int col){
        int array[][] = new int[row][col];
        Scanner scn = new Scanner(System.in);

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println("Enter values for array: " );
                array[i][j] = scn.nextInt();
            }
        }
        scn.close();
        return array;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter rows for matrix 1:");
        int row1 = scn.nextInt();
        System.out.println("Enter columns for matrix 1:");
        int col1 = scn.nextInt();
        int array1[][] = arr(row1,col1);

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Enter rows for matrix 2:");
        int row2 = scn1.nextInt();
        System.out.println("Enter columns for matrix 2:");
        int col2 = scn1.nextInt();
        int array2[][] = arr(row2,col2);

        int array3[][] = new int[row1][col1];

        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                System.out.println(array3[i][j] + "\t");
            }
            System.out.println("\n");
        }

        scn.close();
        scn1.close();


    }

}

