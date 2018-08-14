package com.example.company.collabexample.models;

public class Item {
    private String name;
    private String email;

    public Item(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
