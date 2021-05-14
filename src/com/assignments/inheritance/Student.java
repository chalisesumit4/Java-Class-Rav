package com.assignments.inheritance;

public class Student extends PersonDetails{

    int studentId;
    String email;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student Id:  " + studentId + "\n" +
                "First Name: " + firstName + ", "+
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Phone Number: " + phoneNum + "\n" +
                "Address -> " + address + "\n" +
                "Email: " + email + "\n";
    }
}
