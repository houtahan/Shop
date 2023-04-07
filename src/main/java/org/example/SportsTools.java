package org.example;

import java.util.ArrayList;

public class SportsTools extends Sports{

    private double weight;
    private String material;


    public SportsTools(Seller seller,
                       String name,
                       double price,
                       int quantity,
                       ArrayList<String> comments,
                       ArrayList<Double> rating,
                       String brand,
                       double weight,
                       String material) {
        super(seller, name, price, quantity, comments, rating, brand);
        this.weight = weight;
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SportsTools{" + "seller=" + getSeller().getCompany() + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "weight=" + weight +
                ", material='" + material + '\'' +
                '}' + '\n';
    }
}
