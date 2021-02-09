package com.brycelooyenga.pricingcalculator;


import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private ArrayList<Customer> customerList;
    private PriceList masterList;
    private Scanner scanner;
    private ArrayList<Pit> pitList;
    private ArrayList<Zone> zoneList;


    public UI(Scanner scanner) {

        this.customerList = new ArrayList<>();
        this.masterList = new PriceList("Master List");
        this.pitList = new ArrayList<>();
        this.scanner = scanner;
        this.zoneList = new ArrayList<>();
        builder();


    }


    private static String [] zoneNames = {"North Saskatoon", "West Saskatoon", "North East Saskatoon",
            "East Saskatoon", "Martensville", "Warman", "Langham", "Allan", "Dundurn", "Vanscoy", "Asquith"};



    public void start() {

        boolean quit = false;
        while (!quit) {
            options();
            System.out.println("Please make a selection");
            int choice = Integer.valueOf(scanner.nextLine());
            if (choice == 1) {
                lookUpPrice();
            }

            if (choice == 2) {
                quote();
            }

            if (choice == 3) {
                calculateFreight();
            }

            if (choice == 4) {

            }
        }
    }

    private void builder() {
        double [] southPit  = {7.75, 7.40, 6.85, 6.85, 6.35, 7.95, 8.45, 00, 12.35, 4.25, 9.75, 11.60, 11.70, 0};
        double [] westPit = {7.50, 8.16, 8.16, 9.18, 8.50, 9.50, 4.50, 0, 0, 10.50, 12.10, 9.80, 12.50, 0};
        double[] farWestPit = {8.55, 9.00, 9.00, 9.84, 9.84, 9.61, 10.55, 4.75, 00, 00, 11.60, 13.15, 11.35, 13.50};
        double[] northPit = {0, 3.22, 3.80, 4.50, 3.00, 3.85, 5.50, 10.30, 8.00, 5.50, 7.10, 4.15};
        double[] eastPit= {6.00, 5.65, 5.65, 4.60, 6.35, 6.90, 8.60, 6.35, 8.55, 8.50, 9.85, 7.70};

        //System.out.println(westPit.length);

        addPit("South Pit", 9407, 6);
        addPit("West Pit", 9414, 7.50);
        addPit("East Pit", 9408, 5);
        addPit("Far West Pit", 9402, 7);
        addPit("North Yard", 9428, 0);
        addRates(9407, southPit);
        addRates(9414, westPit);
        addRates(9408, eastPit);
        addRates(9428, northPit);
        addRates(9402, farWestPit);

        String []  names = {"NW Saskatoon", "SW Saskatoon", "NE Saskatoon",
                "SE Saskatoon", "Martensville", "Warman", "Langham", "Allan", "Dundurn", "Vanscoy", "Asquith"};

        for (int i = 0; i < names.length; i++) {
            addZone(names[i], (i + 1));
        }

    }


    private void zoneBuilder(Zone zone) {
        int count = 0;
        for (int i = 0; i < pitList.size(); i++) {
            zone.getPits().add(i, pitList.get(i));
            for (int j = 0; j < pitList.get(i).getRates().size(); j++) {
                 zone.getPrices().add(j, pitList.get(i).getRates().get(j));
            }
        }
    }

    public void addZone(String zoneName, int zoneNumber) {
        Zone zone = new Zone(zoneName, zoneNumber);
        zoneBuilder(zone);
        zoneList.add(zone);
    }



    public void addCustomer(String customer, PriceList priceList) {
        Customer newCustomer = new Customer(customer, priceList);
        customerList.add(newCustomer);

    }


    public void addProduct(String name, double price, int productCode) {
        Product product = new Product(name, price, productCode);
        masterList.addProduct(product);

    }

    public void addPit(String name, int pitNumber, double pitDiscount) {
        pitList.add(new Pit(name, pitNumber, pitDiscount));
    }

    public PriceList newPriceList(String name, double percentage) {
        PriceList list = new PriceList(name);
        for (int i = 0; i < masterList.getProducts().size(); i++) {
            Product newProduct = new Product(masterList.getProducts().get(i).getName(),
                    masterList.getProducts().get(i).getPrice(), (int)
                    masterList.getProducts().get(i).getProductCode());
            list.addProduct(newProduct);

        }
        list.raisePrices(percentage);
        return list;
    }

    private Customer returnCustomer(String customerName) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    private double lookUpPrice(String customerName, int productCode) {
        Customer found = returnCustomer(customerName);
        double price = found.lookUpPrice(productCode);
        return price;
    }


    private double lookUpPrice(String customerName, String productName) {
        if (returnCustomer(customerName) != null) {
            Customer found = returnCustomer(customerName);
            double price = found.lookUpPrice(productName);
            return price;
        }

        return -1;
    }


    private Product lookUpProduct(String customerName, int productCode) {
        if (returnCustomer(customerName) != null) {
            Customer found = returnCustomer(customerName);
            Product product = found.lookUpProduct(productCode);
            return product;
        }

        return null;
    }


    private Product lookUpProduct(String customerName, String productName) {
        if (returnCustomer(customerName) != null) {
            Customer found = returnCustomer(customerName);
            return found.lookUpProduct(productName);
        }

        return null;
    }


    private void options() {
        System.out.println("=======Main Menu======");
        System.out.println("1. " + "\t" + "Look up Price" + "\n" +
                "2. " + "\t" + "Generate Quote" + "\n" +
                "3. " + "\t" + "Calculate Freight " + "\n" + "4. " + "\t" +
                "View Price List");

    }


    private static boolean isNumber(String word) {
        if (Character.isDigit(word.charAt(word.length() - 1))) {
            return true;
        }
        return false;
    }


    private Product productLookUpByCode(String custName, String input, boolean display) {
        int code = Integer.valueOf(input);
        if (lookUpPrice(custName, code) != -1) {
            double price = lookUpPrice(custName, code);
            Product foundProduct = lookUpProduct(custName, code);
            if (display) {
                System.out.println(custName + ": " + foundProduct.getName() + ": " + String.format("%.2f", price));
            }
            return foundProduct;
        } else {
            System.out.println("That product doesn't exist");
            System.out.println();
            return null;
        }
    }

    private Product productLookUpByName(String custName, String input, boolean display) {
        if (lookUpPrice(custName, input) != -1) {
            Product foundProduct = lookUpProduct(custName, input);
            double price = lookUpPrice(custName, input);
            if (display) {
                System.out.println(custName + ": " + foundProduct.getName() + ": " + String.format("%.2f", price));
            }
            return foundProduct;
        } else {
            System.out.println("That product doesn't exist");
            System.out.println();
        }
   return null; }


    private void lookUpPrice() {
        while (true) {
            System.out.println("=======Price Look Up======");
            System.out.println("Please enter customer's name, press 'B' to go back");
            String custName = scanner.nextLine();
            if (custName.toLowerCase().equals("b")) {
                break;
            }
            System.out.println("Please enter product code or product description");
            String input = scanner.nextLine();

            if (isNumber(input)) {
                productLookUpByCode(custName, input, true);

            } else {
                productLookUpByName(custName, input, true);
            }
        }

    }

    private Pit lookupPit(int pitNumber) {
        for (Pit pit: pitList) {
            if (pitNumber == pit.getPitNumber()) {
                return pit;
            }
        }
   return null; }


   private String returnZoneName(int zone) {
        return zoneNames[zone - 1];
   }




    private void quote() {
        System.out.println("====Generate Quote====");
        System.out.println("Please enter customer name");
        String customer = scanner.nextLine();
        Customer quotedCustomer = returnCustomer(customer);
        while (true) {
            System.out.println("Please enter product name or product code");
            String input = scanner.nextLine();
            Product quotedProduct = null;

            if (isNumber(input)) {
                quotedProduct = productLookUpByCode(customer, input, false);

            } else {
                quotedProduct = productLookUpByName(customer, input, false);
            }

            System.out.println("Please enter tonnage");
            int tonnage = Integer.valueOf(scanner.nextLine());
            System.out.println("Please write pit number, press 0 to see pit list");
            int pitNumber = Integer.valueOf(scanner.nextLine());
            if (pitNumber == 0) {
                dispayPits();
            }
            Pit foundPit = lookupPit(pitNumber);
            System.out.println("Please enter zone, please 0 to see zones");
            int zone = Integer.valueOf(scanner.nextLine());
            if (zone == 0) {
                dispayRates(foundPit);
                System.out.println("Please enter zone");
                zone = Integer.valueOf(scanner.nextLine());
                System.out.println();

            }

            double deliveredPrice = quotedProduct.getPrice() - foundPit.getRate(zone);
            System.out.println();
            Quote quote = new Quote(quotedCustomer, quotedProduct, tonnage, foundPit, zone);
            System.out.println(quote);
            System.out.println("Press 'S' to add to quote list");
            String choice = scanner.nextLine();
            if (choice.toUpperCase().equals("S")) {
                quotedCustomer.addToQuotes(quote);
            }

            if (quotedCustomer.getQuoteList().size() > 1) {
                quotedCustomer.printQuotes();
            }
            System.out.println("Press x to exit or any other button to add another quote");
            String secondChoice = scanner.nextLine().toUpperCase();
            if (secondChoice.equals("X")) {
                break;
            }
        }

    }

    private void calculatePickupPrice(Pit pit) {
            System.out.println("Please enter price");
            double price = Double.valueOf(scanner.nextLine());
            Freight freight = new Freight(pit, null, null, null);
            System.out.println(freight.pickUpString(price));

        }


        private void calculateDeliverPrice(Pit pit) {
            System.out.println("Please enter price");
            double price = Double.valueOf(scanner.nextLine());
            System.out.println("Please enter zone");
            Zone foundZone = returnZone(Integer.valueOf(scanner.nextLine()));
            Freight freight = new Freight(pit, null, null, foundZone);
            System.out.println(freight.deliveredString(price));


        }


        private void calculateFromCustomerPrice(Pit pit) {
            System.out.println("Please enter customer name");
            String custName = scanner.nextLine();
            System.out.println("Please enter product code");
            int prodCode = Integer.valueOf(scanner.nextLine());
            System.out.println();
        }



    public void calculateFreight() {
        while(true) {
            System.out.println("====Freight====");
            freightOptions();
            System.out.println("Choose an option");
            int option = Integer.valueOf(scanner.nextLine());
            if (option == 1) {
                System.out.println("Please enter pit number");
                int pitNumber = Integer.valueOf(scanner.nextLine());
                Pit foundPit = lookupPit(pitNumber);
                System.out.println("Pick up or delivery('P' for pickup and 'D' for delivery, B for back");
                String choice = scanner.nextLine();
                if (choice.toUpperCase().equals("P")) {
                    calculatePickupPrice(foundPit);
                } else if (choice.toUpperCase().equals("D")) {
                    calculateDeliverPrice(foundPit);
                } else if (choice.toUpperCase().equals("B")) {
                    break;
                } else {
                    System.out.println("That option does not exist");
                }

            }

            if (option == 2) {
                System.out.println();
            }
        }


    }

    private Zone returnZone(int zoneNumber) {
        return zoneList.get(zoneNumber - 1);
    }



    private boolean checkPit(int pitNumber) {
    for (Pit pit: pitList) {
        if (pit.getPitNumber() == pitNumber) {
            return true;
        }
    }
        System.out.println("Pit doesn't exist");
    return true;  }


    public boolean addRates(int pitNumber, double [] rateList) {
        if (checkPit(pitNumber)) {
            Pit pit = lookupPit(pitNumber);
            pit.addRates(rateList);
            return true;
        }
   return false; }



    private void freightOptions() {
        System.out.println("1. " + "\t" + "Calculate User Entered Price" + "\n" + "2. " + "\t" +
                "Calculate from Customer Price" + "\n" + "3. " + "\t" + "Calculate Custom Freight Rate"
                + "\n" + "4. " + "\t" + "Go Back");
    }


    private void dispayPits() {
        System.out.println("===Pit List===");
        for (Pit pit: pitList) {
            System.out.println(pit);
        }
    }


    private void dispayRates(Pit pit) {
     for (int i = 0; i < zoneNames.length; i++) {
         System.out.println(("Zone " + (i + 1) + ": " + zoneNames[i] + " - " + pit.getRates().get(i)));
     }
    }




}



