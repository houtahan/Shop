package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.UIManager.get;
import static org.example.Shop.*;

public class Admin {
    private String username;
    private String password;
    private String email;

    public Admin(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    public static void viewAwaitingOrders(Admin admin) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("These shopping carts are purchased and ready to deliver : ");
        System.out.println(awaiting);
        Thread.sleep(3000);
        System.out.println("Which one would you like to confirm?");
        choice = sc.nextInt();
        if (choice <= awaiting.size()) {
            ArrayList<Product> temp1;
            temp1 = awaiting.get(choice - 1).getUser().getPurchasedProducts();
            ArrayList<Product> temp2;
            temp2 = awaiting.get(choice - 1).getConfirm();
            ArrayList<Product> temp3 = new ArrayList<>();
            temp3.addAll(temp1);
            temp3.addAll(temp2);
            awaiting.get(choice-1).getUser().setPurchasedProducts(temp3);
            complete.add(awaiting.get(choice-1).getConfirm());
            System.out.println(complete);
            System.out.println("Order was successfully registered!");
            Thread.sleep(3000);
            double transaction = awaiting.get(choice-1).getTotal();
            double userWallet0 = awaiting.get(choice-1).getUser().getWallet();
            awaiting.get(choice-1).getUser().setWallet(userWallet0-transaction);;
            double shopProfit0 = Shop.getProfit();
            Shop.setProfit(shopProfit0 + transaction*0.1);
            System.out.println(Shop.getProfit());
            Thread.sleep(10000);
            awaiting.get(choice-1).getUser().setPurchasedProducts(awaiting.get(choice-1).getConfirm());
            ArrayList<Product> empty = new ArrayList<>();
            awaiting.get(choice-1).getUser().setUserOrders(empty);
//            if (awaiting.get(choice-1).getUser().isSubscriptionService() == true) {
//                for (int i = 0; i <= awaiting.get(choice-1).getConfirm().size(); i++) {
//                    double sellerWallet0 = awaiting.get(choice-1).getConfirm().get(i).getSeller().getWallet();
//                    awaiting.get(choice - 1).getConfirm().get(i).getSeller().setWallet(awaiting.get(choice - 1).getConfirm().get(i).getPrice() * (98 / 100) + sellerWallet0);
//                }
//            } else {
//                for (int i = 0 ; i < awaiting.get(choice-1).getConfirm().size() ; i++) {
//                    System.out.println("Im here");
//                    Thread.sleep(4000);
//                    //double sellerWallet0 = awaiting.get(choice-1).getConfirm().get(i).getSeller().getWallet();
//                    System.out.println("hggs");
//                    Thread.sleep(5000);
//                    awaiting.get(choice-1).getConfirm().get(i).getSeller().setWallet(awaiting.get(choice-1).getConfirm().get(i).getPrice());
//                }
//            }
        }
        else{
                System.out.println("This order doesn't exist!");
                Thread.sleep(2400);
            }
        }


    public static void viewAddToWalletRequests(Admin admin) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("These users would like to add funds : ");
        System.out.println(increaseFund);
        Thread.sleep(3000);
        System.out.println("Which one would you like to accept?");
        System.out.println("Press 0 for none");
        choice = sc.nextInt();
        if (choice <= increaseFund.size() && choice > 0){
            increaseFund.get(choice-1).getUserFund().setWallet(increaseFund.get(choice-1).getAddFund());
            System.out.println("Fund was added to user's wallet successfully!");
            Thread.sleep(3000);
        }
        if (choice > increaseFund.size()){
            System.out.println("This user does not exist!");
            Thread.sleep(3000);
        }
    }

    public static void giveAuthorizationToSeller(Admin admin) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("These sellers would like authorization to sell : ");
        System.out.println(authorization);
        Thread.sleep(3000);
        System.out.println("Which one would you like to give authorization to?");
        System.out.println("Press 0 for none");
        int choice = sc.nextInt();
        if (choice <= authorization.size() && choice > 0){
            authorization.get(choice-1).setAllowed(true);
            authorization.remove(choice-1);
            System.out.println("Authorization was given successfully!");
            Thread.sleep(2500);
        }
        else{
            System.out.println("This seller does not exist!");
        }
    }


    public static void addAdmin() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the admin username : ");
        String username = sc.next();
        System.out.println("Enter the admin password : ");
        String password = sc.next();
        System.out.println("Enter the admin email address : ");
        String email = sc.next();
        Admin admin = new Admin(username, password, email);
        admins.add(admin);
        System.out.println("Admin " + username + " was added successfully!");
        Thread.sleep(5000);
    }


    public static ArrayList<User> viewUserProfile(String username){
        ArrayList<User> foundUser = new ArrayList<>();
        for (User user : users){
            if (user.getUsername().equals(username)){
                foundUser.add(user);
            }
        }
        return foundUser;
    }

    public static void addHeadAdmin(Admin admin){
        admins.add(admin);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
