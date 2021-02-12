package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;
import java.util.Random;

public class Customer {

    private String name;
    private int customerID;
    PriceList priceList;
    private ArrayList<Quote> quoteList;

    Random rand = new Random();


    public Customer(String name, PriceList priceList) {
        this.name = name;
        this.priceList = priceList;
        this.customerID = rand.nextInt(999);
        this.quoteList = new ArrayList<>();


    }

    public String getName() {
        return name;
    }


    public ArrayList<Quote> getQuoteList() {
        return this.quoteList;
    }


    public double lookUpPrice(int productCode) {
        double price = 0;
        for (Product product : this.priceList.getProducts()) {
            if (product.getProductCode() == productCode) {
                price = product.getPrice();
                return price;
            }
        }
        return -1;
    }

    public double lookUpPrice(String productName) {
        for (Product product : this.priceList.getProducts()) {
            if (productName.equals(product.getName())) {
                return product.getPrice();
            }
        }
        return -1;
    }

    public Product lookUpProduct(int productCode) {
        for (Product product : this.priceList.getProducts()) {
            if (productCode == product.getProductCode()) {
                return product;
            }
        }
        return null;
    }

    public Product lookUpProduct(String productName) {
        for (Product product : this.priceList.getProducts()) {
            if (productName.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }


    public boolean addToQuotes(Quote quote) {
        quoteList.add(quote);
        return true;
    }



        public void printQuotes() {
        double sum = 0;
        double value = 0;
        for (Quote quote: quoteList) {
            System.out.println(quote);
            sum+=quote.getTonnage();
            value+=quote.getTotal();
        }
            System.out.println("Total tons: " + sum);
            System.out.println("Value:  $" + value);
    }


    public static String dotCount(int stringLength) {
        String dots = "";
        for (int i = 0; i < (30 - stringLength); i++) {
            dots+=".";
        }
  return dots;  }

    private String formatter(double amount) {
        return String.format("$" + "%.2f", amount);
    }


    public void printPriceList() {
        String dots = "";
        System.out.println();
        System.out.println("=======" + this.name.toUpperCase() + "=======");
        for (int i = 0; i < priceList.getProducts().size(); i++) {
            System.out.println(priceList.getProducts().get(i).getName() + dotCount(priceList.getProducts().get(i).getName().length()) +  formatter(priceList.getProducts().get(i).getPrice()));
        }
    }










}
