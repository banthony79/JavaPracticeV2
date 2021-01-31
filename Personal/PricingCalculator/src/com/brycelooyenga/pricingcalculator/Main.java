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
            PriceList cat2 = ui.newPriceList("Category 2", 1.15);
            //PriceList cat3 = cat2.raisePrices(10);



            ui.addCustomer("ABC Construction", cat1);
            ui.addCustomer("Bryce's Construction", cat2);


            ui.start();




        }


    }


