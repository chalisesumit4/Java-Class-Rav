package com.assignments;

import java.util.Scanner;

public class asg8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int rowSize = scan.nextInt();
        System.out.println("Enter column size: ");
        int colSize = scan.nextInt();

        int arr1[][] = new int[rowSize][colSize];
        int arr2[][] = new int[rowSize][colSize];
        int arr3[][] = new int[rowSize][colSize];

        System.out.println("Enter values for matrix 1");
        for(int i=0; i<rowSize; i++){
            for (int j = 0; j < colSize; j++) {
                System.out.println("At index(" + i +"," + j+"): ");
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter values for matrix 2");
        for(int i=0; i<rowSize; i++){
            for (int j = 0; j < colSize; j++) {
                System.out.println("At index(" + i +"," + j+"): ");
                arr2[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<rowSize; i++){
            for (int j = 0; j < colSize; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        //displaying values of matrix 3
        System.out.println("Displaying values of matrix 3");
        for(int i=0; i<rowSize; i++){
            for (int j = 0; j < colSize; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }
        scan.close();
    }
}
