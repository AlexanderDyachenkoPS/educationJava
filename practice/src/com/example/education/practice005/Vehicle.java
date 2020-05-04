package com.example.education.practice005;

public abstract class Vehicle {

    private String vehicleType;
    private int price;
    private String brand;


    Vehicle(String vehicleType, int price, String brand) {
        setBrand(brand);
        setPrice(price);
        setVehicleType(vehicleType);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void buy (int quantity) {
        System.out.println("Buy " + quantity + " " + getClass() + " entities");
    }

    public abstract void emotion();
}
