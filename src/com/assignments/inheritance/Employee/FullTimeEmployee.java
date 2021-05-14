package com.assignments.inheritance.Employee;

public class FullTimeEmployee extends Employee{
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Employee Id: " + employeeId + "\n" +
                "First Name: " + firstName + ", " +
                "Last Name: " + lastName + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: " + salary + "\n";
    }


}
