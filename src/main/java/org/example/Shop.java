package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Seller> sellers = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
//  every available item
    static ArrayList<ArrayList<Product>> complete = new ArrayList<>();
//  every shopping cart that has been completed and purchased
    private static double profit;
//  profit made by the shop
    static ArrayList<Seller> authorization = new ArrayList<>();
    static ArrayList<Rating> rates = new ArrayList<>();
    static ArrayList<ConfirmOrder> awaiting = new ArrayList<>();
//  orders that need confirmation
    static ArrayList<Fund> increaseFund = new ArrayList<>();


    public Shop(double profit) {
        this.profit = profit;
    }

    public static double getProfit() {
        return profit;
    }

    public static void setProfit(double profit) {
        Shop.profit = profit;
    }

    public static void addProduct(){
        Product no1 = new SportsWearable(null,
                "sneakers",
                40.00,
                3,
                null,
                null,
                "Puma",
                "Germany",
                40,
                "leather");
        Product no2 = new SportsWearable(null,
                "sneakers",
                38.00,
                9,
                null,
                null,
                "Adidas",
                "America",
                39.5,
                "leather");
        products.add(no1);
        products.add(no2);
    }

    public static boolean loginAsUser(String username, String password) throws InterruptedException {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Welcome to your user account dear " + username + "!");
                Thread.sleep(2500);
                Main.userMenu(username, password);
                return true;
            }
        }
        System.out.println("This user account does not exist!");
        Thread.sleep(3000);
        Main.runMenu();
        return false;
        }


    public static boolean loginAsSeller(String company, String password) throws InterruptedException {
        for (Seller seller : sellers) {
            if (seller.getCompany().equals(company) && seller.getPassword().equals(password)) {
                System.out.println("Welcome to your seller account!");
                Thread.sleep(2500);
                Main.sellerMenu(company, password);
                return true;
            }
        }
        System.out.println("This seller account does not exist!");
        Thread.sleep(3000);
        Main.runMenu();
        return false;
        }


    public static boolean loginAsAdmin(String username, String password) throws InterruptedException {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                System.out.println("Welcome to your admin account dear " + username + "!");
                Thread.sleep(2500);
                Main.adminMenu(username, password);
                return true;
            }
        }
        System.out.println("This admin account does not exist!");
        Thread.sleep(3000);
        Main.runMenu();
        return false;
    }


    public static void signUpAsUser() throws InterruptedException {
        String username, password, password1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a username for your account : ");
        username = sc.next();
        System.out.println("Please enter a password for your account : ");
        password = sc.next();
        System.out.println("Please enter your password again : ");
//      the line above is asked in some sites
        password1 = sc.next();
        if (password.equals(password1)) {
                if (users.contains(username)) {
                    System.out.println("Username already exists! Please choose another one.");
                    Thread.sleep(3000);
                    signUpAsUser();
                }
                else {
                    User new_User = new User(username,
                            password,
                            null,
                            0,
                            null,
                            null,
                            null,
                            null,
                            0.00,
                            false);
                    users.add(new_User);
                    System.out.println("User account created successfully!");
                    Thread.sleep(3000);
                    Main.runMenu();
                }
        }
        else if (!password.equals(password1)) {
            System.out.println("Passwords didn't match!");
            Thread.sleep(3000);
            System.out.println("Would you like to try again?");
            System.out.println("Press 1 to try again and press 2 to go to the main menu");
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                signUpAsUser();
            }
            if (choice == 2) {
                Main.runMenu();
            }
            if (choice > 2) {
                System.out.println("This option does not exist!");
            }
        }
    }

    public static void signUpAsSeller() throws InterruptedException {
        String company, password, password1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a your company name : ");
        company = sc.next();
        System.out.println("Please enter a password for your account : ");
        password = sc.next();
        System.out.println("Please enter your password again : ");
//      the line above is asked in some sites
        password1 = sc.next();
        if (password.equals(password1)) {
                if (sellers.contains(company)) {
                    System.out.println("You already have an account in this shop!");
                    Thread.sleep(3000);
                    Main.runMenu();
                }
                else {
                    Seller new_Seller = new Seller(company,
                            password,
                            null,
                            0.00, false);
                    sellers.add(new_Seller);
                    System.out.println("Seller account created successfully!");
                    Thread.sleep(3000);
                    Main.runMenu();
                }
        }
        else if (!password.equals(password1)) {
            System.out.println("Passwords didn't match!");
            Thread.sleep(3000);
            System.out.println("Would you like to try again?");
            System.out.println("Press 1 to try again and press 2 to go to the main menu");
            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                signUpAsSeller();
            }
            if (choice == 2) {
                Main.runMenu();
            }
            if (choice > 2) {
                System.out.println("This option doesn't exist!");
            }
        }
    }


    public static void addUser(){
        User salam = new User("Amir", "1234", "slm", 0, null, null, null, null, 320, false);
        users.add(salam);
    }

    public static void addSeller(){
        Seller salam = new Seller("Reza", "1234", null, 0.00, false);
        sellers.add(salam);
    }

    public static void addAwaiting(){
        User salam = new User("salam", "salmi", "slm", 0, null, null, null, null, 320, false);
        users.add(salam);
        Product no1 = new SportsWearable(null,
                "sneakers",
                40.00,
                3,
                null,
                null,
                "Puma",
                "Germany",
                40,
                "leather");
        ArrayList<Product> kdj = new ArrayList<>();
        kdj.add(no1);
        ConfirmOrder confirmOrder = new ConfirmOrder(salam, kdj, 34);
        awaiting.add(confirmOrder);
    }

}










