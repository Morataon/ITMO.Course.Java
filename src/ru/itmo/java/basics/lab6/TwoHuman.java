package ru.itmo.java.basics.lab6;

abstract class TwoHuman {
    private String firstName;
    private String secondName;

    public TwoHuman(String firstName, String secondName) {
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
