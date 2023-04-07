package org.example;

import java.util.ArrayList;

public class  HouseDecoration extends Household{

    private String color;
    private String pattern;


    public HouseDecoration(Seller seller,
                           String name,
                           double price,
                           int quantity,
                           ArrayList<String> comments,
                           ArrayList<Double> rating,
                           String brand,
                           String material,
                           String color,
                           String pattern) {
        super(seller, name, price, quantity, comments, rating, brand, material);
        this.color = color;
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "HouseDecoration{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                '}' + '\n';
    }
}
