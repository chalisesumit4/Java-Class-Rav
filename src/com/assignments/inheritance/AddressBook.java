package com.assignments.inheritance;

public class AddressBook {
//    String street;
//    String state;
    String city;
    int zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return
                "City: " + city + " " +
                "Zipcode: " + zipcode ;
    }
}
