package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Quote {

    private Customer customer;
    private Product product;
    private int tonnage;
    private Pit pit;
    private int zoneNumber;




    public Quote(Customer customer, Product product, int tonnage, Pit pit, int zoneNumber) {
        this.customer = customer;
        this.product = product;
        this.tonnage = tonnage;
        this.pit = pit;
        this.zoneNumber = zoneNumber;


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

    public double deliveredPrice(int zone, boolean freightAdded) {
        double finalPrice = 0; Zone newZone = pit.returnZone(zone);
        if (freightAdded) {
            return product.getPrice() + newZone.getFreight();
        } else {
            return product.getPrice() - newZone.getFreight();
        }
    }


   public String freightString(int zone) {
        double finalPrice = 0; Zone newZone = pit.returnZone(zone);
        return
                "FREIGHT ADDED: " + "\n" + this.pit.getPitNumber() + " || " + this.customer.getName() +
                " || " + tonnage + " tons of " + this.product.getName() + " || " +
                " || $" + decimalFormatter(product.getPrice()) + " + $" + newZone.getFreight() +
                " = $" + decimalFormatter(deliveredPrice(zone,  true)) + "\n" +
                "FREIGHT DEDUCTED:" + "\n" +
                this.pit.getPitNumber() + " || " + this.customer.getName() +
                " || " + tonnage + " tons of " + this.product.getName() + " || " +
                " || $" + decimalFormatter(product.getPrice()) + " - $" + (newZone.getFreight()) +
                " = $" + decimalFormatter(deliveredPrice(zone, false));

        }


    public String Zone15String(Zone zone) {
        return
                "FREIGHT ADDED: " + "\n" + this.pit.getPitNumber() + " || " + this.customer.getName() +
                        " || " + tonnage + " tons of " + this.product.getName() + " || " +
                        " || $" + decimalFormatter(product.getPrice()) + " + $" + decimalFormatter(zone.getFreight()) +
                        " = $" + decimalFormatter(product.getPrice() + zone.getFreight()) + "\n" +
                        "FREIGHT DEDUCTED:" + "\n" +
                        this.pit.getPitNumber() + " || " + this.customer.getName() +
                        " || " + tonnage + " tons of " + this.product.getName() + " || " +
                        " || $" + decimalFormatter(product.getPrice()) + " - $" + decimalFormatter(zone.getFreight()) +
                        " = $" + decimalFormatter(product.getPrice() - zone.getFreight());

    }







    private String decimalFormatter(double amount) {
        return String.format("%.2f", amount);
    }



    }

