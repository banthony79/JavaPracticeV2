package com.brycelooyenga.pricingcalculator;


import java.util.ArrayList;

public class Zone {

    private String zoneName;
    ArrayList<Pit> pits;
    ArrayList<Double> prices;
    private int zoneNumber;

    public Zone(String zoneName, int zoneNumber) {
        this.zoneName = zoneName;
        this.pits = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.zoneNumber = zoneNumber;
    }


    public String getZoneName() {
        return zoneName;
    }

    private void customFreight(double price) {
        this.prices.add(price);
    }

    public ArrayList<Pit> getPits() {
        return pits;
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public int getZoneNumber() {
        return zoneNumber;
    }

    public double getZoneRate(Pit pit, int zoneNumber) {
        return pit.getRate(zoneNumber);
     }

     public void setZone15(double freight) {
        prices.add(freight);
     }





}
