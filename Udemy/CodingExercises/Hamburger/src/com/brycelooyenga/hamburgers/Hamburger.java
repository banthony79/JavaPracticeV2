package com.brycelooyenga.hamburgers;

public class Hamburger {


    //"Basic", "Sausage",3.56,"White");
    private String name;
    private String meat;
    private String breadRollType;
    private double price;


    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat +
                ", price is " + this.price);
    }

    public void addHamburgerAddition1(String ingredient, double price) {
        this.addition1Name = ingredient;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String ingredient, double price) {
        this.addition2Name = ingredient;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String ingredient, double price) {
        this.addition3Name = ingredient;
        this.addition3Price = price;

    }

    public void addHamburgerAddition4(String ingredient, double price) {
        this.addition4Name = ingredient;
        this.addition4Price = price;

    }

    public double itemizeHamburger() {

        if (addition1Name != null) {
            System.out.println(addition1Name + " added for a price of: " + price);
            this.price+=addition1Price;
        }

        if (addition2Name != null) {
            System.out.println(addition2Name + " added for a price of: " + price);
            this.price+=addition2Price;
        }

        if (addition3Name != null) {
            System.out.println(addition3Name + " added for a price of: " + price);
            this.price+=addition3Price;
        }

        if (addition4Name != null) {
            System.out.println(addition3Name + " added for a price of: " + price);
            this.price+=addition4Price;
        }


        return this.price;

    }
}
