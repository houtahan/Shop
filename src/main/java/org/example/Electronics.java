package org.example;

import java.util.ArrayList;

public class Electronics extends Product {

    private String brand;
    private int madeYear;
    private String color;

    public Electronics(Seller seller,
                       String name,
                       double price,
                       int quantity,
                       ArrayList<String> comments,
                       ArrayList<Double> rating,
                       String brand,
                       int madeYear,
                       String color) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.madeYear = madeYear;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
