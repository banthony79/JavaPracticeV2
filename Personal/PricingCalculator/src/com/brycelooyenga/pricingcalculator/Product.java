package com.brycelooyenga.pricingcalculator;

public class Product {

    private String name;
    private double price;
    private int productCode;



    public Product(String name, double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getProductCode() {
        return this.productCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof  Product)) {
            return false;
        }

        Product product = (Product) other;

        if (this.name.equals(product.getName()) && (this.price == product.getPrice())
            && (this.productCode == this.getProductCode())) {
            return true;
        }
    return false;
    }

    @Override
    public String toString() {
        return this.name + ": $" + String.format("%.2f", this.price);
    }
}
