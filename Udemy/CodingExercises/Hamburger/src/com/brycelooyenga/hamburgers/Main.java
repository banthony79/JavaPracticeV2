package com.brycelooyenga.hamburgers;

public class Main {

        public static void main(String[] args) {
            Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
            hamburger.addHamburgerAddition1("Tomato", 0.27);
            hamburger.addHamburgerAddition2("Lettuce", 0.75);
            hamburger.addHamburgerAddition3("Cheese", 1.13);
            System.out.println("Total Burger price is = " + hamburger.itemizeHamburger());
            System.out.println("******************************************************");
            HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
            healthyBurger.addHamburgerAddition1("Egg", 5.43);
            healthyBurger.addHealthyAddition1("Lentils", 3.41);
            System.out.println("Total Healthy Burger price is = " + healthyBurger.itemizeHamburger());
            System.out.println("******************************************************");
            DeluxeBurger deluxeBurger = new DeluxeBurger();
            String formattedBurgerPrice = String.format("%.2f", deluxeBurger.itemizeHamburger());
            System.out.println("Total Deluxe Burger price is = " + formattedBurgerPrice);
        }
}