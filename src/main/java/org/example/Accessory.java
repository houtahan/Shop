package org.example;

import java.util.ArrayList;

public class Accessory extends Product{

    private String brand;
    private String color;
    private String material;

    public Accessory(Seller seller,
                     String name,
                     double price,
                     int quantity,
                     ArrayList<String> comments,
                     ArrayList<Double> rating,
                     String brand,
                     String color,
                     String material) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.color = color;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return "Accessory{" + "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
