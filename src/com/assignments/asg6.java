package com.assignments;

import javax.swing.*;

public class asg6 {

    public static int luckyNumber(int num){
        int sum_1 = 0;
        int sum_2 = 0;

        while(num !=0){
            int last_digit = num % 10;
            sum_1 += last_digit;
            num /= 10;
        }
        while(sum_1 != 0){
            int last_digit = sum_1 % 10;
            sum_2 += last_digit;
            sum_1 /= 10;

        }
        return sum_2;
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter numbers: "));
        System.out.println("Your lucky number is: " + luckyNumber(num));
    }
}
