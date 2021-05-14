package com.assignments.inheritance;

import java.util.Scanner;

public class InheritenceMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int num_student = scan.nextInt();
        System.out.println("Enter number of teachers:");
        int num_teacher = scan.nextInt();

        //students
        Student student_array[] = new Student[num_student];
        int count = 1;
        System.out.println();
        System.out.println("Enter Student Information \n");
        System.out.println("----------------------------");
        for (int i = 0; i < student_array.length; i++) {
            student_array[i] = new Student();
            System.out.println("Student " + count + " :");
            System.out.println("Enter student id: ");
            student_array[i].setStudentId(scan.nextInt());

            System.out.println("Enter first name: ");
            student_array[i].setFirstName(scan.next());

            System.out.println("Enter last name: ");
            student_array[i].setLastName(scan.next());

            System.out.println("Enter age: ");
            student_array[i].setAge(scan.nextInt());

            System.out.println("Enter phone number: ");
            student_array[i].setPhoneNum(scan.nextLong());

            System.out.println("Enter email address: ");
            student_array[i].setEmail(scan.next());

            System.out.println("Enter address");
            System.out.println("----------------");
            System.out.println("Enter city: ");
            student_array[i].address.setCity(scan.next());

            System.out.println("Enter zipcode: ");
            student_array[i].address.setZipcode(scan.nextInt());
            count++;

        }
        System.out.println();
        // teachers
        Teacher teacher_array[] = new Teacher[num_teacher];
        int cnt = 1;
        System.out.println("Enter Teacher Information");
        System.out.println("----------------------------");
        for (int i = 0; i < teacher_array.length; i++) {
            teacher_array[i] = new Teacher();
            System.out.println("Teacher " + cnt + " :");
            System.out.println("Enter teacher's id: ");
            teacher_array[i].setTeacherid(scan.nextInt());

            System.out.println("Enter first name: ");
            teacher_array[i].setFirstName(scan.next());

            System.out.println("Enter last name: ");
            teacher_array[i].setLastName(scan.next());

            System.out.println("Enter age: ");
            teacher_array[i].setAge(scan.nextInt());

            System.out.println("Enter phone number: ");
            teacher_array[i].setPhoneNum(scan.nextLong());

            System.out.println("Enter email address: ");
            teacher_array[i].setEmail(scan.next());

            System.out.println("Enter address");
            System.out.println("----------------");
            System.out.println("Enter city: ");
            teacher_array[i].address.setCity(scan.next());

            System.out.println("Enter zipcode: ");
            teacher_array[i].address.setZipcode(scan.nextInt());
            cnt++;
        }

        //printing info
        System.out.println("Showing Student Records:");
        System.out.println("-----------------------------");
        for (Student s:
             student_array) {
            System.out.println(s);
        }
        System.out.println("==============================================");
        System.out.println("Showing Teacher Records:");
        System.out.println("-----------------------------");
        for (Teacher t:
            teacher_array ) {
            System.out.println(t);
        }
    }
}
