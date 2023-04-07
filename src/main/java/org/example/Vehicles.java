package org.example;

import java.util.ArrayList;

public class Vehicles extends Product {

    private String brand;
    private double weight;
    private int horsePower;
    private double zeroTOHundred;
    private String color;
    private String fuelType;
    private int madeYear;

    public Vehicles(Seller seller,
                    String name,
                    double price,
                    int quantity,
                    ArrayList<String> comments,
                    ArrayList<Double> rating,
                    String brand,
                    double weight,
                    int horsePower,
                    double zeroTOHundred,
                    String color,
                    String fuelType,
                    int madeYear) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.weight = weight;
        this.horsePower = horsePower;
        this.zeroTOHundred = zeroTOHundred;
        this.color = color;
        this.fuelType = fuelType;
        this.madeYear = madeYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getZeroTOHundred() {
        return zeroTOHundred;
    }

    public void setZeroTOHundred(double zeroTOHundred) {
        this.zeroTOHundred = zeroTOHundred;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }
}


