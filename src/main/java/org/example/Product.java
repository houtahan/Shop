package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Shop.rates;

public class Product {
    private Seller seller;
    private String name;
    private double price;
    private int quantity;
    private ArrayList<String> comments = new ArrayList<>();
    private ArrayList<Double> rating = new ArrayList<>();
    public Product(Seller seller, String name, double price, int quantity, ArrayList<String> comments, ArrayList<Double> rating) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public ArrayList<Double> getRating() {
        return rating;
    }

    public void setRating(ArrayList<Double> rating) {
        this.rating = rating;
    }

    public void addComment(String comment) throws InterruptedException {
        this.comments.add(comment);
        System.out.println("Comment was successfully added!");
        Thread.sleep(3000);
    }

    public boolean addRating(User user, Product product) throws InterruptedException {
        for (Rating rating1 : rates) {
            if (rating1.getUser().equals(user) && rating1.getProduct().equals(product)) {
                System.out.println("You have already rated this product!");
                Thread.sleep(3000);
                return false;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("How would you rate this product?");
        double rate;
        rate = sc.nextDouble();
        this.rating.add(rate);
        System.out.println("Rating was added successfully!");
        Thread.sleep(2500);
        Rating temp = new Rating(user, product);
        rates.add(temp);
        return true;
        }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", comments=" + comments +
                '}';
    }
}
