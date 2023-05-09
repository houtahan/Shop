package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Shop.*;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi!");
        System.out.println("Welcome to Houtan's online shop!");
        Thread.sleep(4000);
        System.out.println("You can contact us via our web address and support phone number!");
        System.out.println("Web address : houtantah@gmail.com");
        System.out.println("Phone number : 09002471382");
        Thread.sleep(4000);
        System.out.println("--------------------------------");
        Admin admin = new Admin("Ali",
                "1234",
                "houtantah@gmail.com");
        Admin.addHeadAdmin(admin);
        Shop.addSeller();
        Shop.addUser();
        Shop.addProduct();
        runMenu();
    }

    public static void runMenu() throws InterruptedException {
        String username, password, company;
        System.out.println("How would you like to continue?");
        System.out.println("1. Login as User");
        System.out.println("2. Login as Seller");
        System.out.println("3. Login as Admin");
        System.out.println("4. Sign up as User");
        System.out.println("5. Sign up as Seller");
        System.out.println("6. Exit Houtan's shop");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter your username : ");
                username = sc.next();
                System.out.println("Please enter you password : ");
                password = sc.next();
                Shop.loginAsUser(username, password);
                break;
            case 2:
                System.out.println("Please enter your company name : ");
                company = sc.next();
                System.out.println("Please enter your password : ");
                password = sc.next();
                Shop.loginAsSeller(company, password);
                break;
            case 3:
                System.out.println("Please enter your username : ");
                username = sc.next();
                System.out.println("Please enter your password : ");
                password = sc.next();
                Shop.loginAsAdmin(username, password);
                break;
            case 4:
                Shop.signUpAsUser();
                break;
            case 5:
                Shop.signUpAsSeller();
                break;
            case 6:
                System.out.println("Goodbye! We hope to see you again.");
                Thread.sleep(2500);
                System.exit(0);
            default:
                System.out.println("This option does not exist!");
                Thread.sleep(4000);
                runMenu();
        }
    }

    public static void userMenu(String username, String password) throws InterruptedException {
        boolean houtan = true;
        while (houtan) {
            User user = null;
            for (User user1 : users) {
                if (user1.getUsername().equals(username) && user1.getPassword().equals(password)) {
                    user = user1;
                }
            }
            Scanner sc = new Scanner(System.in);
            String name, comment;
            double rating;
            System.out.println("Please select an option : ");
            System.out.println("1. Search item by name");
            System.out.println("2. View shopping cart");
            System.out.println("3. View awaiting confirmation orders");
            System.out.println("4. View registered orders");
            System.out.println("5. View wallet");
            System.out.println("6. View subscription service");
            System.out.println("7. View all available products");
            System.out.println("8. Update my profile");
            System.out.println("9. Go to the main menu");
            int choice, choice1, item, quantity;
            double rate;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter item's name : ");
                    name = sc.next();
                    ArrayList<Product> temp;
                    temp = User.searchProductByName(name);
                    if (temp.size() == 0) {
                        System.out.println("No product with that name was found!");
                        Thread.sleep(2500);
                        userMenu(username, password);
                    } else {
                        System.out.println(temp);
                        System.out.println("Choose an item : ");
                        item = sc.nextInt();
                        if (item <= temp.size()) {
                            System.out.println("This is the item you chose : ");
                            System.out.println(temp.get(item-1));
                            Thread.sleep(2500);
                            System.out.println("What do you want to do?");
                            System.out.println("Press 1 to add to cart, 2 to add a comment and 3 to rate");
                            choice1 = sc.nextInt();
                            if (choice1 == 1) {
                                System.out.println("How many of this item do you want?");
                                quantity = sc.nextInt();
                                if (quantity > temp.get(item-1).getQuantity()) {
                                    System.out.println("We don't have that many of this item in our stock!");
                                    Thread.sleep(3000);
                                    break;
                                } else {
                                    user.addToCart(temp.get(item - 1), quantity);
                                    System.out.println(user.getShoppingCart());
                                    userMenu(username, password);
                                }
                            }
                            if (choice1 == 2) {
                                System.out.println("Enter your comment : ");
                                comment = sc.next();
                                temp.get(item-1).addComment(comment);
                                break;
                            }
                            if (choice1 == 3) {
                                temp.get(item-1).addRating(user, temp.get(item-1));
                                break;
                            }
                            if (choice1 > 3) {
                                System.out.println("This option doesn't exist!");
                                Thread.sleep(3000);
                                break;
                            }
                        }
                        else{
                            System.out.println("This product doesn't exist!");
                            Thread.sleep(2000);
                            break;
                        }
                    }
                case 2:
                    user.viewShoppingCart(user);
                    break;
                case 3:
                    user.awaitingConfirmationOrders(user);
                    break;
                case 4:
                    user.registeredOrders(user);
                    break;
                case 5:
                    user.viewUserWallet(user);
                    break;
                case 6:
                    user.viewSubscriptionService(user);
                    break;
                case 7:
                    System.out.println(products);
                    break;
                case 8:
                    user.updateMyProfile(user);
                    break;
                case 9:
                    runMenu();
                    break;
                default:
                    System.out.println("This option does not exist!");
                    Thread.sleep(4000);
            }
        }
    }

    public static void sellerMenu(String company, String password) throws InterruptedException {
        boolean houtan = true;
        while (houtan) {
            Seller seller = null;
            for (Seller seller1 : sellers) {
                if (seller1.getCompany().equals(company) && seller1.getPassword().equals(password)) {
                    seller = seller1;
                }
            }
            Scanner sc = new Scanner(System.in);
            if (!seller.isAllowed()) {
                System.out.println("1. Get authorization to sell");
                System.out.println("2. View my available products");
                System.out.println("3. Go to the main menu");
            } else {
                System.out.println("1. Add product to list");
                System.out.println("2. View my available products");
                System.out.println("3. Go to the main menu");
            }
            int choice;
            choice = sc.nextInt();
            if (!seller.isAllowed()) {
                switch (choice) {
                    case 1:
                        seller.getAuthorization(seller);
                        break;
                    case 2:
                        seller.viewMyAvailableProducts(seller);
                        break;
                    case 3:
                        runMenu();
                        break;
                    default:
                        System.out.println("This option does not exist!");
                        Thread.sleep(3000);
                }
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("What type of product would you like to add?");
                        System.out.println("1. Accessory");
                        System.out.println("2. Beverage");
                        System.out.println("3. Edible");
                        System.out.println("4. Book");
                        System.out.println("5. Car");
                        System.out.println("6. Motorcycle");
                        System.out.println("7. Formal clothe");
                        System.out.println("8. Sports wearable");
                        System.out.println("9. Sports tools");
                        System.out.println("10. House decoration");
                        System.out.println("11. Kitchen");
                        System.out.println("12. Makeup");
                        System.out.println("13. Screen electronics");
                        System.out.println("14. Other electronics");
                        System.out.println("15. Instrument");
                        System.out.println("16. Go back");
                        int choice1;
                        choice1 = sc.nextInt();
                        seller.addProductBySeller(seller, choice1);
                        System.out.println("Product added successfully!");
                        Thread.sleep(3000);
                        break;
                    case 2:
                        seller.viewMyAvailableProducts(seller);
                        break;
                    case 3:
                        runMenu();
                        break;
                    default:
                        System.out.println("This option does not exist!");
                        Thread.sleep(3000);
                }
            }
        }
    }
    public static void adminMenu(String username, String password) throws InterruptedException {
        boolean houtan = true;
        while (houtan) {
            Admin admin = null;
            for (Admin admin1 : admins) {
                if (admin1.getUsername().equals(username) && admin1.getPassword().equals(password)) {
                    admin = admin1;
                }
            }
            String username1, password1, email1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select an option : ");
            System.out.println("1. View awaiting orders");
            System.out.println("2. View add to wallet requests");
            System.out.println("3. Give authorization to seller");
            System.out.println("4. Add an admin");
            System.out.println("5. View user profile");
            System.out.println("6. View shop profit");
            System.out.println("7. View completed orders");
            System.out.println("8. Go to the main menu");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    admin.viewAwaitingOrders(admin);
                    break;
                case 2:
                    admin.viewAddToWalletRequests(admin);
                    break;
                case 3:
                    admin.giveAuthorizationToSeller(admin);
                    break;
                case 4:
                    admin.addAdmin();
                    break;
                case 5:
                    ArrayList<User> temp1;
                    System.out.println("Please enter user's username : ");
                    username1 = sc.next();
                    temp1 = Admin.viewUserProfile(username1);
                    System.out.println("This is the user profile : ");
                    System.out.println(temp1);
                    Thread.sleep(10000);
                    break;
                case 6:
                    System.out.println("Shop profit until this moment is : " + Shop.getProfit());
                    Thread.sleep(3000);
                    break;
                case 7:
                    System.out.println(complete);
                    Thread.sleep(3000);
                case 8:
                    runMenu();
                default:
                    System.out.println("This option doesn't exist!");
                    adminMenu(username, password);
            }
        }
    }

}