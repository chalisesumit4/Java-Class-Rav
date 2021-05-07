package com.assignments.Employee;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of employees: ");
        int num = scan.nextInt();
        int count = 1;
        Employee empArray[] = new Employee[num];
        for (int i = 0; i < empArray.length; i++) {
            empArray[i] = new Employee();
            System.out.println("Employee # " + count++  +" :");
            System.out.println("=====================");
            System.out.println("Enter Employee id: ");
            empArray[i].setEmpId(scan.nextInt());

            System.out.println("Enter Employee's first name: ");
            String firstName = scan.next();
            System.out.println("Enter Employee's last name: ");
            String lastName = scan.next();
            empArray[i].setFullName(firstName, lastName);

            System.out.println("Enter Employee position: ");
            empArray[i].setPosition(scan.next());

            System.out.println("Enter Employee's phone number: ");
            empArray[i].setPhoneNum(scan.nextLong());

            System.out.println("Enter Employee's hired date(format -> (yyyy/MM/dd): ");
            String dateFormat = "yyyy/MM/dd";
            empArray[i].setHiredDate(new SimpleDateFormat(dateFormat).parse(scan.next()));
        }
        // printing method
        // using toString()
//        for (Employee e:
//             empArray) {
//            System.out.println(e);
//        }
        // using getters
        System.out.println("Displaying Employee information:");
        System.out.println("Id" + "\t\t" + "  Name" + "\t\t\t" + "Position" + "\t" + "Phone Number" + "\t\t" + "Hired Date");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < empArray.length; i++) {
            System.out.println(empArray[i].getEmpId() + "\t" + empArray[i].getFullName() + "\t" + empArray[i].getPosition() +
                    "\t\t" + empArray[i].getPhoneNum() + "\t\t" + empArray[i].getHiredDate());
        }
        scan.close();
    }
}
