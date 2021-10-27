package com.planeApp.person;

public class Passport {
    private int passportNumber;
    private Nationality nationality;

    public Passport(int passportNumber, Nationality nationality) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}
