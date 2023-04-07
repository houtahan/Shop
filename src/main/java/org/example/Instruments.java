package org.example;

import java.util.ArrayList;

public class Instruments extends Product{

    private String brand;
    private String type;
    private String color;
    private int madeYear;


    public Instruments(Seller seller,
                       String name,
                       double price,
                       int quantity,
                       ArrayList<String> comments,
                       ArrayList<Double> rating,
                       String brand,
                       String type,
                       String color,
                       int madeYear) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.madeYear = madeYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    @Override
    public String toString() {
        return "Instruments{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", madeYear=" + madeYear +
                '}' + '\n';
    }
}
