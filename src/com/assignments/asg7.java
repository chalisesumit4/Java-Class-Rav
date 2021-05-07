package com.assignments;

import java.util.Scanner;

public class asg7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arr_size = scan.nextInt();

        int arr1[] = new int[arr_size];
        int arr2[] = new int[arr_size];
        int arr3[] = new int[arr_size];

        System.out.println("Enter array 1 values:");
        for(int i=0; i<arr_size; i++){
            System.out.println("At index " + i + " :");
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter array 2 values:");
        for(int i=0; i<arr_size; i++){
            System.out.println("At index " + i + " :");
            arr2[i] = scan.nextInt();
        }
        for(int i=0; i<arr_size; i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        //displaying values
        System.out.println("Displaying the third array values:");
        System.out.println("-----------------------------------");
        for (int a:
             arr3) {
            System.out.print(a + "\t");
        }
        scan.close();
    }
}
