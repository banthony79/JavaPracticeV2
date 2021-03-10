package com.brycelooyenga.pricingcalculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UI ui = new UI(scanner);




           ui.addPit("North Yard", 9428, 0);
           ui.addPit("East Pit", 9408, 5.00);
           ui.addPit("South Pit", 9407, 6.00);
           ui.addPit("Far West Pit", 9402, 8.00);
           ui.addPit("West Pit", 9414, 7.50);


        PriceList cat1 = new PriceList("Cat1");
        cat1.addProduct("Base Gravel", 20, 66025);
        cat1.addProduct("Sub base", 15, 67310);
        PriceList cat2 = new PriceList("Cat2");
        cat2.raisePrices(10);
        PriceList retail = new PriceList("Retail");
        retail.raisePrices(25);


        ui.addCustomer("ABC Construction", cat1);
        ui.addCustomer("Bryce's Construction", cat2);
        ui.addCustomer("AAA Excavating", retail);

        ui.start();
    }
}
