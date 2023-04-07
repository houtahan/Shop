package org.example;

import java.util.ArrayList;

public class ConfirmOrder {
    private User user;
    private ArrayList<Product> confirm;
    private double total;

    public ConfirmOrder(User user, ArrayList<Product> confirm, double total) {
        this.user = user;
        this.confirm = confirm;
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Product> getConfirm() {
        return confirm;
    }

    public void setConfirm(ArrayList<Product> confirm) {
        this.confirm = confirm;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ConfirmOrder{" +
                "user=" + user.getUsername() +
                ", order=" + confirm +
                ", total=" + total +
                '}';
    }
}
