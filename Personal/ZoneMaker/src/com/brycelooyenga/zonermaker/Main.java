package com.brycelooyenga.zonermaker;

import java.util.ArrayList;

public class Main {

    private static double[] southPit = {7.75, 7.40, 6.85, 6.85, 6.35, 7.95, 8.45, 00, 12.35, 4.25, 9.75, 11.60, 11.70};
    private static double[] westPit = {7.50, 8.16, 8.16, 9.18, 8.50, 9.50, 4.50, 0, 0, 10.50, 12.10, 9.80, 12.50};
    private static double[] farWestPit = {8.55, 9.00, 9.00, 9.84, 9.84, 9.61, 10.55, 4.75, 00, 11.60,
            13.15, 11.35, 13.50};
    private static double[] northPit = {3.22, 3.80, 4.50, 3.00, 3.85, 5.50, 10.30, 8.00, 5.50, 7.10, 4.15, 5.50, 3.25};
    private static double[] eastPit = {6.00, 5.65, 5.65, 4.60, 6.35, 6.90, 8.60, 6.35, 8.55, 8.50, 9.85, 7.70, 8.00};

    public static void main(String[] args) {

       ArrayList<Pit> pits = new ArrayList<>();
       ArrayList<Zone> zones = new ArrayList<>();


       Pit pit = new Pit("South Pit", 9407);
       pits.add(pit);
       pit = new Pit("North Pit", 9428);
       pits.add(pit);
       pit = new Pit("West Pit", 9414);
       pits.add(pit);
       pit = new Pit("Far West Pit", 9402);
       pits.add(pit);
       pit = new Pit("East Pit", 9408);
       pits.add(pit);

       ArrayList<double []> freightPrices = new ArrayList<>();




       freightPrices.add(westPit);
       freightPrices.add(southPit);
       freightPrices.add(farWestPit);
       freightPrices.add(northPit);
       freightPrices.add(eastPit);

       zoneCreator(pits, zones);
       assignFreight(zones, westPit, 9414);
       assignFreight(zones, northPit, 9428);
       assignFreight(zones, southPit, 9407);
       assignFreight(zones, eastPit, 9408);
       assignFreight(zones, farWestPit, 9402);


       displayZones(zones);

    }



    public static void assignFreight(ArrayList<Zone> zoneList, double [] pricingArray, int pitNumber) {

        for (int i = 0; i < zoneList.size(); i++) {
            if (zoneList.get(i).getPit().getPitNumber() == pitNumber) {
                zoneList.get(i).setFreight(pricingArray[zoneList.get(i).getZoneNumber()]);

            }
        }
    }



    public static void zoneCreator(ArrayList<Pit> pits, ArrayList<Zone> zoneArrayList) {
        Pit pit = null; int zoneNumber = 0;
        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < pits.size(); i++) {
                pit = pits.get(i);
                zoneNumber = j;
                Zone zone = new Zone(pit, zoneNumber);
                zoneArrayList.add(zone);


            }
        }

    }

    public static void displayZones(ArrayList<Zone> zoneList) {
        for (Zone zone: zoneList) {
            System.out.println(zone);
        }
    }



}