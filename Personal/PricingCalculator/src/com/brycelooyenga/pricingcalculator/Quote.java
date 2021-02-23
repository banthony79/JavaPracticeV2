package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Quote {

    private Customer customer;
    private Product product;
    private int tonnage;
    private Pit pit;
    private double freight;
    private boolean freightAdded;


    public Quote(Customer customer, Product product, int tonnage, Pit pit, double freight, boolean freightAdded) {
        this.customer = customer;
        this.product = product;
        this.tonnage = tonnage;
        this.pit = pit;
        this.freight = freight;
        this.freightAdded = freightAdded;
    }

    public Customer getCustomer() {
        return customer;
    }


    public Product getProduct() {
        return product;
    }

    public int getTonnage() {
        return tonnage;
    }

    public Pit getPit() {
        return pit;
    }



    public double getTotal() {
        return product.getPrice() * tonnage;
    }

    public double deliveredPrice(double price, int zone) {
        if (freightAdded) {
            return price + pit.getRate(zone);
        } else {
            return price - pit.getRate(zone);
        }
    }


   /* public String freightString(int zone) {
        return this.pit.getPitNumber() + " || " + this.customer.getName() +
                " || " + tonnage + " tons of " + this.product.getName() + " || " +
                " || $" + decimalFormatter(product.getPrice()) + " - $" + decimalFormatter(this.pit.getRate(zone)) +
                " = $" + decimalFormatter(deliveredPrice(this.product.getPrice(), zone);
    } */


    public String addedFreight(int zone) {
        return this.pit.getPitNumber() + " || " + this.customer.getName() +
                " || " + tonnage + " tons of " + this.product.getName() + " || " +
                " || $" + decimalFormatter(product.getPrice()) + " + $" + decimalFormatter(this.pit.getRate(zone)) +
                " = $" + decimalFormatter(deliveredPrice(this.product.getPrice(), zone)) + " a ton";
    }


    private String decimalFormatter(double amount) {
        return String.format("%.2f", amount);
    }



    }

