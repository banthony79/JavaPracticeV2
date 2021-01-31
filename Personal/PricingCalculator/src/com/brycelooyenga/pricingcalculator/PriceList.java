package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;


public class PriceList {

    private String name;
    private ArrayList<Product> prices;




    public PriceList(String name) {
        this.prices = new ArrayList<Product>();
        this.name = name;


    }

    public ArrayList<Product> getProducts() {
        return prices;
    }




    public boolean addProduct(Product product) {
        if (findProduct(product) == null) {
            prices.add(product);

            return true;
        } else {
            System.out.println("That product already exists");
            return false;
        }

    }


    public boolean addProduct(String name, double price, int productCode) {
        prices.add(new Product(name, price, productCode));
        return true;
    }


    public Product findProduct(Product newProduct) {
        for (Product product : prices) {
            if (product.equals(newProduct)) {

                return product;
            }
        }

        return null;
    }


    public Product findProduct(int productCode) {
        for (Product product : prices) {
            if (productCode == product.getProductCode()) {
                return product;
            }
        }
        System.out.println("The product does not exist");
        return null;
    }


    public void print() {
        for (Product product : this.getProducts()) {
            System.out.println(product);
        }
    }

    public PriceList raisePrices(double percentage) {
        double price = 0;
        for (int i = 0; i < this.getProducts().size(); i++) {
            price = this.prices.get(i).getPrice();
            this.prices.get(i).
                    setPrice(price * (percentage));
        }
    return this;
    }




}
