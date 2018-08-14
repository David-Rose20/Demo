package com.example.company.collabexample.models;

// Item model
public class Item {
    // Model consists of name & email strings
    private String name;
    private String email;

    // Constructor
    public Item(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
