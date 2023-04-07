package org.example;

public class Fund {
    private User userFund;
    private double addFund;


    public Fund(User userFund, double addFund) {
        this.userFund = userFund;
        this.addFund = addFund;
    }

    public User getUserFund() {
        return userFund;
    }

    public void setUserFund(User userFund) {
        this.userFund = userFund;
    }

    public double getAddFund() {
        return addFund;
    }

    public void setAddFund(double addFund) {
        this.addFund = addFund;
    }

    @Override
    public String toString() {
        return "Fund{" +
                "User requesting fund=" + userFund.getUsername() + '\n' +
                ", User's previous fund=" + userFund.getWallet() + '\n'  +
                ", User's request=" + addFund +
                '}';
    }
}
