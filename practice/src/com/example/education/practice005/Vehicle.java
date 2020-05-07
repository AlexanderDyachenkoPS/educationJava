package com.example.education.practice005;

public class Vehicle {

    private String registrationNumber;
    private String vendor;
    private String model;

    public static final String UNKNOWN_VEHICLE = "";


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle() {
        this.registrationNumber = UNKNOWN_VEHICLE;
        this.vendor = UNKNOWN_VEHICLE;
        this.model = UNKNOWN_VEHICLE;
    }

    public Vehicle(String registrationNumber, String vendor, String model) {
        this.registrationNumber = registrationNumber;
        this.vendor = vendor;
        this.model = model;
    }
}
