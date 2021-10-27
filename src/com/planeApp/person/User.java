package com.planeApp.person;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String id;
    private int passport;



    public User(String name, String email, String phoneNumber, int passport, List<String> id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = UUID.randomUUID().toString();
        this.passport = passport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
}
