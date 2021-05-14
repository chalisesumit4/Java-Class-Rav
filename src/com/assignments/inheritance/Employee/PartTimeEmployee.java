package com.assignments.inheritance.Employee;

public class PartTimeEmployee extends Employee{

    int numHours;
    float ratePerHour;
    double salary;

    public int getNumHours() {
        return numHours;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int numHours, float ratePerHour) {
        this.salary = numHours * ratePerHour;
    }

    @Override
    public String toString() {
        return  "Employee Id: " + employeeId + "\n" +
                "First Name: " + firstName + ", " +
                "Last Name: " + lastName  + "\n" +
                "Designation: " + designation + "\n" +
                "No. of Hours: " + numHours + "\n" +
                "Rate/hour: " + ratePerHour + "\n" +
                "Salary: " + salary + "\n";
    }
}
