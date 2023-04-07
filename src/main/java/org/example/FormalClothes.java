package org.example;

import java.util.ArrayList;

public class FormalClothes extends Product {

    private String brand;
    private String madeCounty;
    private String size;
    private String material;

    public FormalClothes(Seller seller,
                         String name,
                         double price,
                         int quantity,
                         ArrayList<String> comments,
                         ArrayList<Double> rating,
                         String brand,
                         String madeCounty,
                         String size,
                         String material) {
        super(seller, name, price, quantity, comments, rating);
        this.brand = brand;
        this.madeCounty = madeCounty;
        this.size = size;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeCounty() {
        return madeCounty;
    }

    public void setMadeCounty(String madeCounty) {
        this.madeCounty = madeCounty;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        return "FormalClothes{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "brand='" + brand + '\'' +
                ", madeCounty='" + madeCounty + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}' + '\n';
    }
}
