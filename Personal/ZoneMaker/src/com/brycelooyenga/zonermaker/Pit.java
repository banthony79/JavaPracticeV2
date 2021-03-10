package com.brycelooyenga.zonermaker;

public class Pit {

    private String pitName;
    private int pitNumber;

    public Pit(String pitName, int pitNumber) {
        this.pitName = pitName;
        this.pitNumber = pitNumber;
    }

    public String getPitName() {
        return pitName;
    }

    public int getPitNumber() {
        return pitNumber;
    }
}
