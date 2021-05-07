package com.assignments;

import java.util.Scanner;

public class asg2 {

    public static void findGreatestNum(int n1, int n2, int n3){
        if(n1==n2 && n1 == n3) {
            System.out.println("All three numbers are equal.");
        }
        else if(n1>n2 && n1>n3) {
            System.out.println(n1 + " is the greatest number.");
        }
        else if(n2>n1 && n2>n3) {
            System.out.println(n2 + " is the greatest number.");
        }
        else {
            System.out.println(n3 + " is the greatest number.");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = scn.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scn.nextInt();
        System.out.println("Enter third number: ");
        int n3 = scn.nextInt();
        findGreatestNum(n1,n2,n3);
        scn.close();
    }
}
