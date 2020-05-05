package com.example.education.practice005;

public class Person {
    private String name;
    private String surname;

    public static final String UNNAMED_PERSON = "";

    public Person() {
        this.name = UNNAMED_PERSON;
        this.surname = UNNAMED_PERSON;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
