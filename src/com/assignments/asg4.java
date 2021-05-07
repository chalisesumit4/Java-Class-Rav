package com.assignments;

import java.util.Scanner;

public class asg4 {

    public static void starPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starReversePattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of star patterns: ");
        int num = scn.nextInt();
        System.out.println("(a)");
        System.out.println("---");
        starPattern(num);
        System.out.println("====================");
        System.out.println("(b)");
        System.out.println("---");
        starReversePattern(num);
    }
}
