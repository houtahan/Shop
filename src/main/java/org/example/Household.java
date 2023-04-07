package org.example;

import java.util.ArrayList;

public class Household extends Product{

    private String brand;
    private String material;

    public Household(Seller seller,
                     String name,
                     double price,
                     int quantity,
                     ArrayList<String> comments,
                     ArrayList<Double> rating,
                     String brand,
                     String material) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
