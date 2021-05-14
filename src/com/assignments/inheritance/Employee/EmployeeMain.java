package com.assignments.inheritance.Employee;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of full time employees: ");
        int num_Ft_Emp = scan.nextInt();

        System.out.println("Enter number of part time employees: ");
        int num_Pt_Emp = scan.nextInt();

        //full time employee
        FullTimeEmployee fullTimeEmployee[] = new FullTimeEmployee[num_Ft_Emp];
        int count = 1;
        for (int i = 0; i < fullTimeEmployee.length; i++) {
            System.out.println("Full time Employee " + count + " :");
            System.out.println("------------------------");
            fullTimeEmployee[i] = new FullTimeEmployee();
            System.out.println("Enter employee id: ");
            fullTimeEmployee[i].setEmployeeId(scan.nextByte());
            System.out.println("Enter first name: ");
            fullTimeEmployee[i].setFirstName(scan.next());
            System.out.println("Enter last name: ");
            fullTimeEmployee[i].setLastName(scan.next());
            System.out.println("Enter employee designation: ");
            fullTimeEmployee[i].setDesignation(scan.next());
            System.out.println("Enter salary: ");
            fullTimeEmployee[i].setSalary(scan.nextDouble());
            count++;
        }

        //part time employee
        System.out.println();
        int cnt = 1;
        PartTimeEmployee partTimeEmployee[] = new PartTimeEmployee[num_Pt_Emp];
        for (int i = 0; i < partTimeEmployee.length; i++) {
            partTimeEmployee[i] = new PartTimeEmployee();
            System.out.println("Part time Employee" + cnt + " :");
            System.out.println("------------------------");
            System.out.println("Enter employee id: ");
            partTimeEmployee[i].setEmployeeId(scan.nextByte());
            System.out.println("Enter first name: ");
            partTimeEmployee[i].setFirstName(scan.next());
            System.out.println("Enter last name: ");
            partTimeEmployee[i].setLastName(scan.next());
            System.out.println("Enter employee designation: ");
            partTimeEmployee[i].setDesignation(scan.next());
            System.out.println("Enter number of hours: ");
            partTimeEmployee[i].setNumHours(scan.nextInt());
            System.out.println("Enter rate per hour: ");
            partTimeEmployee[i].setRatePerHour(scan.nextFloat());
            partTimeEmployee[i].setSalary(partTimeEmployee[i].getNumHours(),
                    partTimeEmployee[i].getRatePerHour());
            cnt++;
        }

        //printing info
        System.out.println();
        System.out.println("Full time employee records: ");
        System.out.println("------------------------------");
        for (FullTimeEmployee ft:
             fullTimeEmployee) {
            System.out.println(ft);
        }
        System.out.println("-------------------------------");
        System.out.println("Part time employee records: ");
        System.out.println("------------------------------");
        for (PartTimeEmployee pt:
             partTimeEmployee) {
            System.out.println(pt);
        }
    }
}
