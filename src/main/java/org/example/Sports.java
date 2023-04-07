package org.example;

import java.util.ArrayList;

public class Sports extends Product{

    private String brand;

    public Sports(Seller seller,
                  String name,
                  double price,
                  int quantity,
                  ArrayList<String> comments,
                  ArrayList<Double> rating,
                  String brand) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
