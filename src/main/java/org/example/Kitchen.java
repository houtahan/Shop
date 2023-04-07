package org.example;

import java.util.ArrayList;

public class Kitchen extends Household{


    public Kitchen(Seller seller,
                   String name,
                   double price,
                   int quantity,
                   ArrayList<String> comments,
                   ArrayList<Double> rating,
                   String brand,
                   String material) {
        super(seller, name, price, quantity, comments, rating, brand, material);
    }

    @Override
    public String toString() {
        return "Kitchen{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() + ", ratings=" + getRating() +
                "}" +'\n';
    }
}
