package com.brycelooyenga.pricingcalculator;

import java.util.Random;

public class Customer {

    private String name;
    private int customerID;
    PriceList priceList;

    Random rand = new Random();


    public Customer(String name, PriceList priceList) {
        this.name = name;
        this.priceList = priceList;
        this.customerID = rand.nextInt(999);


    }

    public String getName() {
        return name;
    }




    public double lookUpPrice(int productCode) {
        double price = 0;
        for (Product product: this.priceList.getProducts()) {
            if (product.getProductCode() == productCode) {
                price  = product.getPrice();
                return price;
            }
        }
   return -1; }

    public double lookUpPrice(String productName) {
        for (Product product: this.priceList.getProducts()) {
            if (productName.equals(product.getName())) {
                return product.getPrice();
            }
        }
        return -1; }








}
