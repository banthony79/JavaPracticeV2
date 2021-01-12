package com.brycelooyenga.hamburgers;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price,"Whole Wheat");

    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            System.out.println(healthyExtra1Name + " added for a price of: " + healthyExtra1Price);
            price += healthyExtra1Price;
        }

        if (healthyExtra2Name != null) {
            System.out.println(healthyExtra2Name + " added for a price of: " + healthyExtra2Price);
            price += healthyExtra2Price;

        }
   return price;  }


}
