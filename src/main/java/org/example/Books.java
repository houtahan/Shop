package org.example;

import java.util.ArrayList;

public class Books extends Product {

    private String author;
    private String genre;
    private int yearOfPublish;
    private String ISBN;


    public Books(Seller seller,
                 String name,
                 double price,
                 int quantity,
                 ArrayList<String> comments,
                 ArrayList<Double> rating,
                 String author,
                 String genre,
                 int yearOfPublish,
                 String ISBN) {
        super(seller, name, price, quantity, comments, rating);
        this.author = author;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Books{" + "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", comments=" + getComments() +
                ", ratings=" + getRating() +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", ISBN='" + ISBN + '\'' +
                '}'+ '\n';
    }
}
