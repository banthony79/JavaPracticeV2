package com.brycelooyenga.pricingcalculator;


import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private ArrayList<Customer> customerList;
    private PriceList masterList;
    private Scanner scanner;

    public UI(Scanner scanner) {

        this.customerList = new ArrayList<>();
        this.masterList = new PriceList("Master List");
        this.scanner = scanner;

    }

    public void start() {

        boolean quit = false;
        while(!quit) {
            options();
            System.out.println("Please make a selection");
            int choice = Integer.valueOf(scanner.nextLine());
            if (choice == 1) {
                lookUpPrice();
            }
        }
    }

    public boolean addCustomer(String customer, PriceList priceList) {
        Customer newCustomer = new Customer(customer, priceList);
        customerList.add(newCustomer);
        return true;
    }


    public boolean addProduct(String name, double price, int productCode) {
        Product product = new Product(name, price, productCode);
        masterList.addProduct(product);
        return true;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public PriceList getMasterList() {
        return masterList;
    }

    public PriceList newPriceList(String name, double percentage) {
        PriceList list = new PriceList(name);
        for (int i = 0; i < masterList.getProducts().size(); i++) {
            Product newProduct = new Product (masterList.getProducts().get(i).getName(),
            masterList.getProducts().get(i).getPrice(), (int)
                    masterList.getProducts().get(i).getProductCode());
            list.addProduct(newProduct);

        }
        list.raisePrices(percentage);
    return list;
    }

    private Customer returnCustomer(String customerName) {
        for (Customer customer: customerList) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
    return null; }

    public double lookUpPrice(String customerName, int productCode) {
        Customer found = returnCustomer(customerName);
        double price = found.lookUpPrice(productCode);
  return price;   }


    public double lookUpPrice(String customerName, String productName) {
        if (returnCustomer(customerName) != null) {
            Customer found = returnCustomer(customerName);
            double price = found.lookUpPrice(productName);
            return price;
        }

    return -1; }


    public void options() {
        System.out.println("=======Main Menu======");
        System.out.println("1. " + "\t" +  "Look up Price" + "\n" +
                "2. " + "\t" + "Generate Quote" + "\n" +
                "3. " +  "\t" + "Calculate Freight " + "\n" + "4. " + "\t" +
                "View Price List");

    }


    public void lookUpPrice() {

        boolean quit = false;

        while (true) {
            System.out.println("=======Price Look Up======");
            System.out.println("Look up price by product code or product name?");
            System.out.println("1. " + "\t" + "Product code" + "\n" +
                    "2. " + "\t" + "Product name" + "\n" + "3. " + "\t" + "Back to Previous Menu");
            int choice = Integer.valueOf(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Please enter name of customer");
                String name = scanner.nextLine();
                System.out.println("Please enter product code");
                int code = Integer.valueOf(scanner.nextLine());
                if (lookUpPrice(name, code) != -1) {
                    double price = lookUpPrice(name, code);
                    System.out.println(name + ": " + String.format("%.2f", price));
                } else {
                    System.out.println("That product doesn't exist");
                    System.out.println();
                }

            } else if (choice == 2) {
                System.out.println("Please enter name of customer");
                String name = scanner.nextLine();
                System.out.println("Please enter product name");
                String product = scanner.nextLine();
                if (lookUpPrice(name, product) != -1) {
                    double price = lookUpPrice(name, product);
                    System.out.println(name + ": " + String.format("%.2f", price));
                } else {
                    System.out.println("That product doesn't exist");
                    System.out.println();
                }
            } else if (choice == 3) {
                break;
            }
        }
    }

    public void quote() {
        System.out.println("Enter customer name");
        String customer = scanner.nextLine();
        
    }

}


