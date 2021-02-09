package com.brycelooyenga.pricingcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            UI ui = new UI(scanner);

            ui.addProduct("Base Gravel", 20, 66025);
            ui.addProduct("One Inch Crushed", 25, 68225);
            ui.addProduct("Screenings", 15, 64100);
            ui.addProduct("Inch and a Half Crushed", 35, 68140);

            PriceList cat1 = ui.newPriceList("Category 1", 1);
            PriceList cat2 = ui.newPriceList("Category 2", 1.3);
            PriceList cat3 = ui.newPriceList("Category 3", 1.5);
            PriceList retail = ui.newPriceList("Retail", 1.10);



            ui.addCustomer("ABC Construction", cat1);
            ui.addCustomer("Bryce's Construction", cat2);
            ui.addCustomer("BL Excavating", cat3);
            ui.addCustomer("AAA Construction", retail);






            ui.start();


        }



    }


