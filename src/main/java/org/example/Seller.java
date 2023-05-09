package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Shop.*;

public class Seller {
    private String company;
    private String password;
    private ArrayList<Product> availableProducts;
    private double wallet;
    private boolean allowed;
//  this boolean shows if the seller is allowed to sell products or not

    public Seller(String company,
                  String password,
                  ArrayList<Product> availableProducts,
                  double wallet,
                  boolean allowed) {
        this.company = company;
        this.password = password;
        this.wallet = wallet;
        this.allowed = allowed;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(ArrayList<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }


    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public void getAuthorization(Seller seller) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to send a request for authorization?");
        System.out.println("Press 1 for YES and 2 for No");
        int choice;
        choice = sc.nextInt();
        if (choice == 1){
            authorization.add(seller);
            System.out.println("Your request has been sent!");
            Thread.sleep(3000);
        }
        if (choice > 2){
            System.out.println("This option doesn't exist!");
            Thread.sleep(2500);
        }
    }

    public void addProductBySeller(Seller seller, int choice) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        if (choice == 1){
            String name, brand, color, material;
            int quantity;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Material : ");
            material = sc.next();
            Accessory accessory = new Accessory(seller, name, price, quantity, null, null, brand, color, material);
            products.add(accessory);
        }
        if (choice == 2){
            String name, brand, type, whatItContains, taste, dateOfManufacture, expirationDate;
            int quantity;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Date of manufacture : ");
            dateOfManufacture = sc.next();
            System.out.println("Expiration date : ");
            expirationDate = sc.next();
            System.out.println("Taste : ");
            taste = sc.next();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Type : ");
            type = sc.next();
            System.out.println("Contains : ");
            whatItContains = sc.next();
            Beverage beverage = new Beverage(seller, name, price, quantity, null, null, dateOfManufacture, expirationDate, taste, brand, type, whatItContains);
            products.add(beverage);
        }
        if (choice == 3){
            String name, taste, dateOfManufacture, expirationDate, texture;
            int quantity;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Date of manufacture : ");
            dateOfManufacture = sc.next();
            System.out.println("Expiration date : ");
            expirationDate = sc.next();
            System.out.println("Taste : ");
            taste = sc.next();
            System.out.println("Texture : ");
            texture = sc.next();
            Edible edible = new Edible(seller, name, price, quantity, null, null, dateOfManufacture, expirationDate, taste, texture);
            products.add(edible);
        }
        if (choice == 4) {
            String name, author, genre, ISBN;
            int quantity, yearofPublish;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Author : ");
            author = sc.next();
            System.out.println("Genre : ");
            genre = sc.next();
            System.out.println("Year of publish : ");
            yearofPublish = sc.nextInt();
            System.out.println("ISBN : ");
            ISBN = sc.next();
            Books book = new Books(seller, name, price, quantity, null, null, author, genre, yearofPublish, ISBN);
            products.add(book);
        }
        if (choice == 5){
            String name, brand, color, fuelType, steeringWheelType;
            int quantity, horsePower, madeYear, numOfPassengers;
            double price, weight, insideVolume, zeroTohundred;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Weight : ");
            weight = sc.nextDouble();
            System.out.println("Horse power : ");
            horsePower = sc.nextInt();
            System.out.println("Zero to hundred : ");
            zeroTohundred = sc.nextDouble();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Fuel type : ");
            fuelType = sc.next();
            System.out.println("Year of manufacture : ");
            madeYear = sc.nextInt();
            System.out.println("Number of passengers : ");
            numOfPassengers = sc.nextInt();
            System.out.println("Inside volume : ");
            insideVolume = sc.nextDouble();
            System.out.println("Steering wheel type : ");
            steeringWheelType = sc.next();
            Cars car = new Cars(seller, name, price, quantity, null, null, brand, weight, horsePower, zeroTohundred, color, fuelType, madeYear, numOfPassengers, insideVolume, steeringWheelType);
            products.add(car);
        }
        if (choice == 6){
            String name, author, brand, color, fuelType, motorType;
            int quantity, horsePower, madeYear, CC;
            double price, weight, zeroTohundred;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Weight : ");
            weight = sc.nextDouble();
            System.out.println("Horse power : ");
            horsePower = sc.nextInt();
            System.out.println("Zero to hundred : ");
            zeroTohundred = sc.nextDouble();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Fuel type : ");
            fuelType = sc.next();
            System.out.println("Year of manufacture : ");
            madeYear = sc.nextInt();
            System.out.println("Motor type : ");
            motorType = sc.next();
            System.out.println("CC : ");
            CC = sc.nextInt();
            Motorcycle motorcycle = new Motorcycle(seller, name, price, quantity, null, null, brand, weight, horsePower, zeroTohundred, color, fuelType, madeYear, motorType, CC);
            products.add(motorcycle);
        }
        if (choice == 7){
            String name, brand, madeCountry, size, material;
            int quantity;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Made in : ");
            madeCountry = sc.next();
            System.out.println("Size : ");
            size = sc.next();
            System.out.println("Material : ");
            material = sc.next();
            FormalClothes formalClothes = new FormalClothes(seller, name, price, quantity, null, null, brand, madeCountry, size, material);
            products.add(formalClothes);
        }
        if (choice == 8){
            String name, brand, madeCountry, material;
            int quantity;
            double price, size;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Made in : ");
            madeCountry = sc.next();
            System.out.println("Size : ");
            size = sc.nextDouble();
            System.out.println("Material : ");
            material = sc.next();
            SportsWearable sportsWearable = new SportsWearable(seller, name, price, quantity, null, null, brand, madeCountry, size, material);
            products.add(sportsWearable);
        }
        if (choice == 9){
            String name, brand, madeCountry, material;
            int quantity;
            double price, size, weight;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Weight : ");
            weight = sc.nextDouble();
            System.out.println("Material : ");
            material = sc.next();
            SportsTools sportsTools = new SportsTools(seller, name, price, quantity, null, null, brand, weight, material);
            products.add(sportsTools);
        }
        if (choice == 10){
            String name, brand, material, color, pattern;
            int quantity;
            double price, weight;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Material : ");
            material = sc.next();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Pattern : ");
            pattern = sc.next();
            HouseDecoration houseDecoration = new HouseDecoration(seller, name, price, quantity, null, null, brand, material, color, pattern);
            products.add(houseDecoration);
        }
        if (choice == 11){
            String name, brand, material, color, pattern;
            int quantity;
            double price, weight;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Material : ");
            material = sc.next();
            Kitchen kitchen = new Kitchen(seller, name, price, quantity, null, null, brand, material);
            products.add(kitchen);
        }
        if (choice == 12){
            String name, brand, material, color, dateOfManufacture, expirationDate;
            int quantity;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Date of manufacture : ");
            dateOfManufacture = sc.next();
            System.out.println("Expiration date : ");
            expirationDate = sc.next();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Material : ");
            material = sc.next();
            Makeup makeup = new Makeup(seller, name, price, quantity, null, null, brand, dateOfManufacture, expirationDate, color, material);
            products.add(makeup);
        }
        if (choice == 13){
            String name, brand, resolution, color;
            int quantity, storage, madeYear;
            double price, height, width, hours;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Manufacture year : ");
            madeYear = sc.nextInt();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Resolution : ");
            resolution = sc.next();
            System.out.println("Height : ");
            height = sc.nextDouble();
            System.out.println("Width : ");
            width = sc.nextDouble();
            System.out.println("Battery hours : ");
            hours = sc.nextDouble();
            System.out.println("Storage : ");
            storage = sc.nextInt();
            ScreenElectronics screenElectronics = new ScreenElectronics(seller, name, price, quantity, null, null, brand, madeYear, color, resolution, height, width, hours, storage);
            products.add(screenElectronics);
        }
        if (choice == 14){
            String name, brand, color;
            int quantity, madeYear;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Manufacture year : ");
            madeYear = sc.nextInt();
            System.out.println("Color : ");
            color = sc.next();
            OtherElectronics otherElectronics = new OtherElectronics(seller, name, price, quantity, null, null, brand, madeYear, color);
            products.add(otherElectronics);
        }
        if (choice == 15){
            String name, brand, color, type;
            int quantity, madeYear;
            double price;
            System.out.println("Name : ");
            name = sc.nextLine();
            System.out.println("Price : ");
            price = sc.nextDouble();
            System.out.println("Quantity : ");
            quantity = sc.nextInt();
            System.out.println("Brand : ");
            brand = sc.next();
            System.out.println("Type : ");
            type = sc.next();
            System.out.println("Color : ");
            color = sc.next();
            System.out.println("Manufacture year : ");
            madeYear = sc.nextInt();
            Instruments instruments = new Instruments(seller, name, price, quantity, null, null, brand, type, color, madeYear);
            products.add(instruments);
        }
        if (choice == 16){
            Main.sellerMenu(company, password);
        }
        if (choice > 16){
            System.out.println("This option doesn't exist!");
            Thread.sleep(2000);
            Main.sellerMenu(company, password);
        }
        }


    public void viewMyAvailableProducts(Seller seller) throws InterruptedException {
        System.out.println("Your available products : ");
        Thread.sleep(2500);
        if (this.availableProducts.isEmpty()){
            System.out.println("You have no available products!");
            Thread.sleep(3000);
        }
        else{
            System.out.println(this.availableProducts);
            Thread.sleep(4000);
        }
    }


    public void viewSellerWallet(Seller seller) throws InterruptedException {
        System.out.println("You have " + this.wallet + " in your seller account");
        Thread.sleep(3000);
    }


    @Override
    public String toString() {
        return "Seller{" +
                "company='" + company + '\'' +
                ", password='" + password + '\'' +
                ", availableProducts=" + availableProducts +
                ", wallet=" + wallet +
                ", allowed=" + allowed +
                '}';
    }
}
