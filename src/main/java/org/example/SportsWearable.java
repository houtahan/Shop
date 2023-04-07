package org.example;

import java.util.ArrayList;

public class SportsWearable extends Sports{

    private String madeCounty;
    private double size;
    private String material;

    public SportsWearable(Seller seller,
                          String name,
                          double price,
                          int quantity,
                          ArrayList<String> comments,
                          ArrayList<Double> rating,
                          String brand,
                          String madeCounty,
                          double size,
                          String material) {
        super(seller, name, price, quantity, comments, rating, brand);
        this.madeCounty = madeCounty;
        this.size = size;
        this.material = material;
    }

    public String getMadeCounty() {
        return madeCounty;
    }

    public void setMadeCounty(String madeCounty) {
        this.madeCounty = madeCounty;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SportsWearable{" + "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + getBrand() +
                "madeCounty='" + madeCounty + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' + '\n' +
                '}';
    }
}
