package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Pit {

    private String pitName;
    private int pitNumber;
    private ArrayList<Product> products;
    private ArrayList<Zone> rateList;
    private double pickupDiscount;


    public Pit(String pitName, int pitNumber, double pickupDiscount) {
        this.pitName = pitName;
        this.pitNumber = pitNumber;
        this.pickupDiscount = pickupDiscount;
        this.products = new ArrayList<>();
        this.rateList = new ArrayList<>();


    }


    public String getPitName() {
        return pitName;
    }

    public int getPitNumber() {
        return pitNumber;
    }



    public ArrayList<Product> getProducts() {
        return products;
    }


    public double getPickupDiscount() {
        return this.pickupDiscount;
    }

    public void addZone(ArrayList<Zone> masterZoneList) {
        for (Zone zone: masterZoneList) {
            if (zone.getPit().equals(this)) {
                rateList.add(zone);
            }
        }

    }


    public Zone returnZone(int zoneNumber) {
        for (Zone zone: rateList) {
            if (zone.getZoneNumber() == zoneNumber) {
                return zone;
            }
        }
   return null; }


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void displayRates(ArrayList<Zone> zoneList) {
        for (Zone zone: zoneList) {
            if (zone.getPit().getPitNumber() == this.getPitNumber()) {
                System.out.println(zone);
            }
        }
    }





    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }


        if (this.pitNumber == ((Pit) obj).getPitNumber()) {
            return true;
        }

   return false; }







}


