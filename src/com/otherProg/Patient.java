package com.otherProg;

public class Patient {

    private int patientId;
    private String patientName;
    private String disease;
    private String address;
    private long contactno;

    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getContactno() {
        return contactno;
    }
    public void setContactno(long contactno) {
        this.contactno = contactno;
    }
}