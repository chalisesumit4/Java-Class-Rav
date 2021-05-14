package com.assignments.inheritance;

public class PersonDetails {

    String firstName;
    String lastName;
    int age;
    long phoneNum;
    AddressBook address = new AddressBook();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressBook getAddress() {
        return address;
    }

    public void setAddress(AddressBook address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFullName(){
        return firstName + " " + lastName;
   }
}
