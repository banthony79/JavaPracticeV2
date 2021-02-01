package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Quote {

    private Customer customer;
    private Product product;
    private int tonnage;
    private Pit pit;
    private int zone;
    private ArrayList<String> list;

    public Quote(Customer customer, Product product, int tonnage, Pit pit, int zone) {
        this.customer = customer;
        this.product = product;
        this.tonnage = tonnage;
        this.list = new ArrayList<>();
        this.pit = pit;
        this.zone = zone;
    }


    public Customer getCustomer() {
        return customer;
    }


    public Product getProduct() {
        return product;
    }

    public void addToQuote() {
        list.add(this.toString());
    }

    private double calculate() {
        return tonnage * product.getPrice();
    }

}
