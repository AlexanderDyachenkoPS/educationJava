package com.example.education.practice005;

public class Space {
    private Person person;
    private Vehicle vehicle;

    public Space(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }

    public Space() {
        this.person = new Person();
        this.vehicle = new Vehicle();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree (Vehicle vehicle) {
        if (vehicle.getClass().isInstance(Vehicle.class) || vehicle.getRegistrationNumber().equals(Vehicle.UNKNOWN_VEHICLE)) {
            return true;
        } else {
            return false;
        }
    }

}
