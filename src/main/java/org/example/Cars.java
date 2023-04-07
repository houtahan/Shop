package org.example;

import java.util.ArrayList;

public class Cars extends Vehicles{

    private int numOfPassenger;
    private double insideVolume;
    private String steeringWheelType;

    public Cars(Seller seller,
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
                int numOfPassenger,
                double insideVolume,
                String steeringWheelType) {
        super(seller, name, price, quantity, comments, rating, brand, weight, horsePower, zeroTOHundred, color, fuelType, madeYear);
        this.numOfPassenger = numOfPassenger;
        this.insideVolume = insideVolume;
        this.steeringWheelType = steeringWheelType;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public double getInsideVolume() {
        return insideVolume;
    }

    public void setInsideVolume(double insideVolume) {
        this.insideVolume = insideVolume;
    }

    public String getSteeringWheelType() {
        return steeringWheelType;
    }

    public void setSteeringWheelType(String steeringWheelType) {
        this.steeringWheelType = steeringWheelType;
    }

    @Override
    public String toString() {
        return "Cars{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "numOfPassenger=" + numOfPassenger +
                ", insideVolume=" + insideVolume +
                ", steeringWheelType='" + steeringWheelType + '\'' +
                '}' + '\n';
    }
}
