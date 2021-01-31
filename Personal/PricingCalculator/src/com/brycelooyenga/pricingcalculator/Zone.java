package com.brycelooyenga.pricingcalculator;

public class Zone {

    private int zoneNumber;
    private String zoneName;
    private double zoneRate;

    public Zone(int zoneNumber, String zoneName, double zoneRate) {
        this.zoneNumber = zoneNumber;
        this.zoneName = zoneName;
        this.zoneRate = zoneRate;
    }

    public void setZoneNumber(int zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setZoneRate(double zoneRate) {
        this.zoneRate = zoneRate;
    }
}
