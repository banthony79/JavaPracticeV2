package com.brycelooyenga.pricingcalculator;

import java.util.ArrayList;

public class Pit {

    private String pitName;
    private int pitNumber;
    private ArrayList<Double> rates;

    public Pit(String pitName, int pitNumber) {
        this.pitName = pitName;
        this.pitNumber = pitNumber;
        this.rates = new ArrayList<>();
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

}
