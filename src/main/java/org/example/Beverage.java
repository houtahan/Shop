package org.example;

import java.util.ArrayList;

public class Beverage extends Groceries{

    private String brand;
    private String type;
//  type here means cold or hot
    private String whatItContains;
//  this variable shows how much fat, carbohydrate, ... the beverage has


    public Beverage(Seller seller,
                    String name,
                    double price,
                    int quantity,
                    ArrayList<String> comments,
                    ArrayList<Double> rating,
                    String dateOfManufacture,
                    String expirationDate,
                    String taste,
                    String brand,
                    String type,
                    String whatItContains) {
        super(seller, name, price, quantity, comments, rating, dateOfManufacture, expirationDate, taste);
        this.brand = brand;
        this.type = type;
        this.whatItContains = whatItContains;
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


    public String getWhatItContains() {
        return whatItContains;
    }

    public void setWhatItContains(String whatItContains) {
        this.whatItContains = whatItContains;
    }

    @Override
    public String toString() {
        return "Beverage{" + "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", whatItContains='" + whatItContains + '\'' +
                '}' + '\n';
    }
}
