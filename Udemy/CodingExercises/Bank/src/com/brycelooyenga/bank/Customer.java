package com.brycelooyenga.bank;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double intialTranscation) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.addTransaction(intialTranscation);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }


}
