package com.brycelooyenga.hamburgers;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition3("Drink", 1.80);

    }

    @Override
    public void addHamburgerAddition1(String ingredient, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String ingredient, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String ingredient, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String ingredient, double price) {
        System.out.println("No additional items can be added to a deluxe burger");

    }
}
