package com.assignments.Employee;

import java.util.Date;

public class Employee {

    int empId;
    String firstName;
    String lastName;
    String fullName;
    String position;
    long phoneNum;
    Date hiredDate;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------");
        return  "Employee Id: " + empId +
                ", Name: '" + fullName + '\'' +
                ", Position: '" + position + '\'' +
                ", Phone Number: " + phoneNum +
                ", Hired Date: " + hiredDate;
    }
}
