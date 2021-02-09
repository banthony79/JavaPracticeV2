package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Quote {

    private Customer customer;
    private Product product;
    private int tonnage;
    private Pit pit;
    private int zone;

    public Quote(Customer customer, Product product, int tonnage, Pit pit, int zone) {
        this.customer = customer;
        this.product = product;
        this.tonnage = tonnage;
        this.pit = pit;
        this.zone = zone;
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

    public int getZone() {
        return zone;
    }

    public double getTotal() {
        return product.getPrice() * tonnage;
    }

    public double deliveredPrice(double price, int zone) {
        return price - pit.getRate(zone);
    }

   @Override
    public String toString() {
       return this.pit.getPitNumber() +  " || " + this.customer.getName() +
               " || " +  tonnage + " tons of " + this.product.getName() + " || " +
               " || $" +  decimalFormatter(product.getPrice()) + " - $" + decimalFormatter(this.pit.getRate(zone)) +
               " = $" + decimalFormatter(deliveredPrice(this.product.getPrice(), zone)) + " a ton";
   }

    private String decimalFormatter(double amount) {
        return String.format("%.2f", amount);
    }


}
