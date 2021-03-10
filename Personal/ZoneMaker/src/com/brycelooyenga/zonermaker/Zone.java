package com.brycelooyenga.zonermaker;

public class Zone {

    private Pit pit;
    private double freight;
    private int zoneNumber;
    private String name;


    public static  String[] zoneNames = {"N Saskatoon", "W Saskatoon", "NE Saskatoon",
            "E Saskatoon", "Martensville", "Warman", "Langham", "Allan", "Dundurn", "Vanscoy", "Asquith",
            "Delisle", "Osler", "Osler"};


    public Zone(Pit pit, int zoneNumber) {
        this.pit = pit;
        this.zoneNumber = zoneNumber;
        this.name = zoneNames[zoneNumber];

    }

    public Pit getPit() {
        return pit;
    }

    public double getFreight() {
        return freight;
    }

    public int getZoneNumber() {
        return zoneNumber;
    }

    public int getZoneNumberProper() {
        return zoneNumber + 1;
    }

    public void setFreight(double newFreight) {
        this.freight = newFreight;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Zone " + this.getZoneNumberProper() + ". (" + this.name + ")" + ": " + this.getPit().getPitName()
                + " - $" + String.format("%.2f", this.getFreight());
    }
}
