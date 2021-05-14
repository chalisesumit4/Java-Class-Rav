package com.assignments.inheritance;

public class Teacher extends PersonDetails{

    int teacherId;
    String email;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherid(int employeeId) {
        this.teacherId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Teacher's id = " + teacherId + "\n" +
                "First Name: " + firstName + ", " +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Phone Number: " + phoneNum + "\n" +
                "Address -> " + address + "\n" +
                "Email: " + email + "\n";

    }
}
