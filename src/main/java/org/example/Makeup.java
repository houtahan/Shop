package org.example;

import java.util.ArrayList;

public class Makeup extends Product{


    private String brand;
    private String dateOfManufacture;
    private String expirationDate;
    private String color;
    private String material;

    public Makeup(Seller seller,
                  String name,
                  double price,
                  int quantity,
                  ArrayList<String> comments,
                  ArrayList<Double> rating,
                  String brand,
                  String dateOfManufacture,
                  String expirationDate,
                  String color,
                  String material) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.color = color;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Makeup{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + brand + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}' + '\n';
    }
}
