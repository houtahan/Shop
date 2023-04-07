package org.example;

import java.util.ArrayList;

public class Motorcycle extends Vehicles{

        private String motorType;
        private int CC;

    public Motorcycle(Seller seller,
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
                      int madeYear,
                      String motorType,
                      int CC) {
        super(seller, name, price, quantity, comments, rating, brand, weight, horsePower, zeroTOHundred, color, fuelType, madeYear);
        this.motorType = motorType;
        this.CC = CC;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "motorType='" + motorType + '\'' +
                ", CC=" + CC +
                '}' + '\n';
    }
}
