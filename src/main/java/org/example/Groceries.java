package org.example;

import java.util.ArrayList;

public class Groceries extends Product {

    private String dateOfManufacture;
    private String expirationDate;
    private String taste;

    public Groceries(Seller seller,
                     String name,
                     double price,
                     int quantity,
                     ArrayList<String> comments,
                     ArrayList<Double> rating,
                     String dateOfManufacture,
                     String expirationDate,
                     String taste) {
        super(seller, name, price, quantity, comments, rating);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.taste = taste;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
