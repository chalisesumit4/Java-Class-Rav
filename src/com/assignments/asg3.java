package com.assignments;

import javax.swing.*;

public class asg3 {

    public static boolean checkPrime(int num){
        if (num % 2 != 0 && num % 3 != 0 && num != 1) {
            if (num % num == 0) {
                return true;
            }
        }
        if(num == 2 || num == 3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        boolean isPrime = checkPrime(num);
        if(isPrime){
            JOptionPane.showMessageDialog(null,num + " is a prime number.");
        }
        else{
            JOptionPane.showMessageDialog(null,num + " is not a prime number.");
        }
    }
}
