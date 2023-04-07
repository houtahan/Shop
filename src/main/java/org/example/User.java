package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Shop.*;

public class User {
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private String address;
    private ArrayList<Product> shoppingCart = new ArrayList<>();
    private ArrayList<Product> userOrders = new ArrayList<>();
    private ArrayList<Product> purchasedProducts = new ArrayList<>();
    private double wallet;
    private boolean subscriptionService;

    public User(String username,
                String password,
                String email,
                int phoneNumber,
                String address,
                ArrayList<Product> shoppingCart,
                ArrayList<Product> userOrders,
                ArrayList<Product> purchasedProducts,
                double wallet,
                boolean subscriptionService) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.wallet = wallet;
        this.subscriptionService = subscriptionService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<Product> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(ArrayList<Product> userOrders) {
        this.userOrders = userOrders;
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedItems) {
        this.purchasedProducts = purchasedItems;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isSubscriptionService() {
        return subscriptionService;
    }

    public void setSubscriptionService(boolean subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public static ArrayList<Product> searchProductByName(String name){
        ArrayList<Product> foundProduct = new ArrayList<>();
        for (Product product : products){
            if (product.getName().equals(name)){
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public void addToCart(Product product, int quantity) throws InterruptedException {
        for (int i = 0 ; i < quantity ; i++) {
            this.shoppingCart.add(product);
        }
        product.setQuantity(product.getQuantity()-quantity);
        System.out.println("Your shopping cart was successfully updated!");
        Thread.sleep(3000);
    }

    public void viewShoppingCart(User user) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your shopping cart : ");
        if (this.getShoppingCart().isEmpty()) {
            System.out.println("You have nothing in your shopping cart!");
            Thread.sleep(4000);
        } else {
            System.out.println(user.getShoppingCart());
            Thread.sleep(4000);
            System.out.println("Would you like to remove any item from the shopping cart?");
            System.out.println("Press 1 for YES and 2 for NO : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Which item would you like to remove?");
                int choice2 = sc.nextInt();
                if (choice2 <= this.shoppingCart.size()) {
                    this.shoppingCart.remove(this.shoppingCart.get(choice2 - 1));
                    System.out.println("Item was removed successfully!");
                    Thread.sleep(3000);
                    viewShoppingCart(user);
                }
            }
            if (choice == 2) {
                System.out.println("Would you like to order this shopping cart?");
                System.out.println("Press 1 for YES and 2 to go back to the user menu : ");
                int choice1 = sc.nextInt();
                if (choice1 == 1) {
                    double total = 0;
                    for (int i = 0; i <= this.shoppingCart.size() - 1; i++) {
                        total = this.shoppingCart.get(i).getPrice() + total;
                    }
                    if (this.subscriptionService == true) {
                        System.out.println("You are part of our subscription plan so you will get 2% off and free shipping!");
                        total = total * (98 / 100);
                        System.out.println("Your wallet :" + this.wallet);
                        System.out.println("Your total :" + total);
                    } else {
                        System.out.println("Your wallet :" + this.wallet);
                        System.out.println("Your total :" + total);
                    }
                    if (this.wallet >= total) {
                        System.out.println("You have enough funds to purchase!");
                        Thread.sleep(3000);
                        System.out.println("Now your order is awaiting confirmation!");
                        LocalDate now = LocalDate.now();
                        System.out.println("Order's date : " + now);
                        Thread.sleep(3000);
                        this.userOrders = this.shoppingCart;
                        ConfirmOrder confirmOrder = new ConfirmOrder(user, this.userOrders, total);
                        awaiting.add(confirmOrder);
                        ArrayList<Product> empty = new ArrayList<>();
                        this.shoppingCart = empty;
                    }
                    else{
                            System.out.println("You dont have enough funds to order!");
                            Thread.sleep(2400);
                            System.out.println("Go back to the menu to increase your funds!");
                            Thread.sleep(2000);
                        }
                    }
                    if (choice1 > 2) {
                        System.out.println("This option does not exist!");
                        Thread.sleep(2500);
                        viewShoppingCart(user);
                    }
                }
                if (choice > 2) {
                    System.out.println("This option does not exist!");
                    Thread.sleep(2500);
                }
            }
            System.out.println(awaiting);
        }

    public void awaitingConfirmationOrders(User user) throws InterruptedException {
        System.out.println("This order is awaiting confirmation : ");
        System.out.println(this.userOrders);
        Thread.sleep(5000);
    }

    public void registeredOrders(User user) throws InterruptedException {
        System.out.println("This order is submitted and ready to deliver : ");
        System.out.println(this.purchasedProducts);
        Thread.sleep(5000);
    }


    public ArrayList<Fund> viewUserWallet(User user) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have " + this.wallet + " in your account");
        System.out.println("Would you like to add to that?");
        System.out.println("Press 1 for yes and 2 for NO");
        int choice;
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("How much would you like your wallet to have?");
            double increase;
            increase = sc.nextDouble();
            if (increase <= this.wallet){
                System.out.println("This request is not possible!");
                Thread.sleep(2500);
            }
            else {
                Fund temp = new Fund(user, increase);
                increaseFund.add(temp);
                System.out.println("A request to add funds was sent to the admins!");
                Thread.sleep(3000);
            }
        }
        if (choice > 2){
            System.out.println("This option doesn't exist");
            Thread.sleep(2500);
            viewUserWallet(user);
        }
        return increaseFund;
    }

    public void viewRegisteredOrders(User user){
        this.getPurchasedProducts();
    }

    public void viewSubscriptionService(User user) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        if (this.subscriptionService == false){
            System.out.println("Would you like our subscription service for 40 tomans?");
            System.out.println("Press 1 for YES and 2 for NO");
            int choice;
            choice = sc.nextInt();
            if (choice == 1){
                if (user.getWallet() >= 40){
                    user.setSubscriptionService(true);
                    user.setWallet(user.getWallet() - 40);
                    System.out.println("You are now part of our subscription service!");
                    Thread.sleep(4000);

                }
            }
            if (choice == 2){

            }
            if (choice > 2){
                System.out.println("This option does not exist!");
                Thread.sleep(2800);
                viewSubscriptionService(user);
            }
        }
        else{
            System.out.println("You are already added to our subscription service!");
            Thread.sleep(3000);
        }
    }

    public void updateMyProfile(User user) throws InterruptedException {
        String email, address;
        int phoneNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("What information would you like to update?");
        System.out.println("1. Email address");
        System.out.println("2. Phone number");
        System.out.println("3. Home address");
        int choice;
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Enter email address : ");
            email = sc.next();
            this.setEmail(email);
            System.out.println("Account updated!");
            Thread.sleep(2500);
        }
        if (choice == 2){
            System.out.println("Enter phone number : ");
            phoneNumber = sc.nextInt();
            this.setPhoneNumber(phoneNumber);
            System.out.println("Account updated!");
            Thread.sleep(2500);
        }
        if (choice == 3){
            System.out.println("Enter home address : ");
            address = sc.next();
            this.setAddress(address);
            System.out.println("Account updated!");
            Thread.sleep(2500);
        }
        if (choice > 3){
            System.out.println("This option does not exist!");
            Thread.sleep(2500);
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", purchasedItems=" + purchasedProducts +
                ", wallet=" + wallet +
                '}';
    }
}
