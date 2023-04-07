package org.example;

import java.util.ArrayList;

public class Edible extends Groceries{

    private String texture;
//  texture means crunchy, crispy, ...


    public Edible(Seller seller,
                  String name,
                  double price,
                  int quantity,
                  ArrayList<String> comments,
                  ArrayList<Double> rating,
                  String dateOfManufacture,
                  String expirationDate,
                  String taste,
                  String texture) {
        super(seller, name, price, quantity, comments, rating, dateOfManufacture, expirationDate, taste);
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Edible{" + "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", ratings=" + getRating() +
                ", comments=" + getComments() +
                "texture='" + texture + '\'' +
                '}' + '\n';
    }
}
