package org.example;

import java.util.ArrayList;

public class ScreenElectronics extends Electronics{

    private String resolution;
    private double height;
    private double width;
    private double hours;
//  this variable lets us know how many hours the electronic can work with full charge
    private int storage;


    public ScreenElectronics(Seller seller,
                             String name,
                             double price,
                             int quantity,
                             ArrayList<String> comments,
                             ArrayList<Double> rating,
                             String brand,
                             int madeYear,
                             String color,
                             String resolution,
                             double height,
                             double width,
                             double hours,
                             int storage) {
        super(seller, name, price, quantity, comments, rating, brand, madeYear, color);
        this.resolution = resolution;
        this.height = height;
        this.width = width;
        this.hours = hours;
        this.storage = storage;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "ScreenElectronics{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "resolution='" + resolution + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", hours=" + hours +
                ", storage=" + storage +
                '}' + '\n';
    }
}
