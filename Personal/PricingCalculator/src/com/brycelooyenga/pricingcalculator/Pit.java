package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Pit {

    private String pitName;
    private int pitNumber;
    private ArrayList<Double> rates;
    private ArrayList<Product> products;
    private double pickupDiscount;

    public Pit(String pitName, int pitNumber, double pickupDiscount) {
        this.pitName = pitName;
        this.pitNumber = pitNumber;
        this.rates = new ArrayList<>();
        this.pickupDiscount = pickupDiscount;
        this.products = new ArrayList<>();
    }


    public String getPitName() {
        return pitName;
    }

    public int getPitNumber() {
        return pitNumber;
    }

    public double getRate(int zone) {
        return rates.get(zone - 1);

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Double> getRates() {
        return this.rates;
    }

    public double getPickupDiscount() {
        return this.pickupDiscount;
    }

    public void addRates(double [] sourceRates) {
            for (int i = 0; i < sourceRates.length; i++) {
                this.rates.add(sourceRates[i]);
            }
        }

    @Override
    public String toString() {
       return this.pitNumber + ": " + this.pitName;
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }






}


