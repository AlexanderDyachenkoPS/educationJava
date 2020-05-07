package com.example.education.practice005;

public abstract class AbstractSpace implements SpaceInterface {
    private Person person;
    private Vehicle vehicle;

    protected AbstractSpace() {
        this.person = new Person();
        this.vehicle = new Vehicle();
    }
    protected AbstractSpace(Person person) {
        this.person = person;
        this.vehicle = new Vehicle();
    }

    protected AbstractSpace(Person person, Vehicle vehicle) {
        this.person = person;
        this.vehicle = vehicle;
    }
}
