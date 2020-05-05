package com.example.education.practice005;

public final class VenicleImmu {


    private String registrationNumber;
    private String vendor;
    private String model;
    private String type;

    public static final String UNKNOWN_VEHICLE = "";

    public VenicleImmu(String registrationNumber, String vendor, String model, String type) {
        this.registrationNumber = registrationNumber;
        this.vendor = vendor;
        this.model = model;
        this.type = type;
    }
}
