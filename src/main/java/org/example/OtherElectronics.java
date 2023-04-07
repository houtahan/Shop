package org.example;

import java.util.ArrayList;


public class OtherElectronics extends Electronics{

    //  this class contains products like consoles, headphones, cameras, speakers, ...


    public OtherElectronics(Seller seller,
                            String name,
                            double price,
                            int quantity,
                            ArrayList<String> comments,
                            ArrayList<Double> rating,
                            String brand,
                            int madeYear,
                            String color) {
        super(seller, name, price, quantity, comments, rating, brand, madeYear, color);
    }

    @Override
    public String toString() {
        return "OtherElectronics{" + "name=" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() + "}" + '\n';
    }
}
