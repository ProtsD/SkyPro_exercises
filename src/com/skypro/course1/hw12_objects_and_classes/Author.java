package com.skypro.course1.hw12_objects_and_classes;

public class Author {
    private String firstName;

    private String secondName;
    private int birthDay;

    Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
