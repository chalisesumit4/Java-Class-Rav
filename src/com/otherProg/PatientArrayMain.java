package com.otherProg;

import java.util.Scanner;

public class PatientArrayMain {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter patinet Array Size");
        int size = scr.nextInt();

        Patient  patientArray[] = new Patient[size];     //  array declaration

        for (int i = 0; i < patientArray.length; i++) {
            patientArray[i] = new Patient();    //  object declaration

            System.out.println("Enter patient Id");
            int pid = scr.nextInt();
            patientArray[i].setPatientId(pid);

            System.out.println("Enter patient name");
            String  pname = scr.next();
            patientArray[i].setPatientName(pname);

            System.out.println("Enter patient disease");
            String  disease = scr.next();
            patientArray[i].setDisease(disease);

            System.out.println("Enter patient address");
            String address = scr.next();
            patientArray[i].setAddress(address);

            System.out.println("Enter patient contact");
            long contact = scr.nextLong();
            patientArray[i].setContactno(contact);
        }

        System.out.println("Pid\tPname\tdisease\taddress\tcontactno");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < patientArray.length; i++) {
            System.out.println(patientArray[i].getPatientId()+"\t"+patientArray[i].getPatientName()+"\t"+patientArray[i].getDisease()+"\t"+patientArray[i].getAddress()+"\t"+patientArray[i].getContactno());
        }

        scr.close();
    }

}
