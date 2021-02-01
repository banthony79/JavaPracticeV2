package com.brycelooyenga.pricingcalculator;


import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private ArrayList<Customer> customerList;
    private PriceList masterList;
    private Scanner scanner;
    private ArrayList<Pit> pitList;

    public UI(Scanner scanner) {

        this.customerList = new ArrayList<>();
        this.masterList = new PriceList("Master List");
        this.pitList = new ArrayList<>();
        this.scanner = scanner;

    }

    public void start() {

        boolean quit = false;
        while (!quit) {
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

    public void addPit(String name, int pitNumber) {
        pitList.add(new Pit(name, pitNumber));
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


    public Product lookUpProduct(String customerName, String productName) {
        if (returnCustomer(customerName) != null) {
            Customer found = returnCustomer(customerName);
            Product product = found.lookUpProduct(productName);
            return product;
        }

        return null;
    }


    public void options() {
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


    private Product productLookUpByCode(String custName, String input) {
        int code = Integer.valueOf(input);
        if (lookUpPrice(custName, code) != -1) {
            double price = lookUpPrice(custName, code);
            Product foundProduct = lookUpProduct(custName, code);
            System.out.println(custName + ": " + foundProduct.getName()  +": " + String.format("%.2f", price));
            return foundProduct;
        } else {
            System.out.println("That product doesn't exist");
            System.out.println();
            return null;
        }
    }

    private Product productLookUpByName(String custName, String input) {
        if (lookUpPrice(custName, input) != -1) {
            Product foundProduct = lookUpProduct(custName, input);
            double price = lookUpPrice(custName, input);
            System.out.println(custName + ": " + foundProduct.getName() + ": " + String.format("%.2f", price));
            return foundProduct;
        } else {
            System.out.println("That product doesn't exist");
            System.out.println();
        }
    }


    public void lookUpPrice() {
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
                productLookUpByCode(custName, input);

            } else {
                productLookUpByName(custName, input);
            }
        }

    }


    public void quote() {
        System.out.println("Please enter customer name");
        String customer = scanner.nextLine();
        System.out.println("Please enter product name or product code");
        String input = scanner.nextLine();
        Product quotedProduct = null;
        Customer quotedCustomer = returnCustomer(customer);
        if (isNumber(input)) {
           quotedProduct =  productLookUpByCode(customer, input);

        } else {
           quotedProduct = productLookUpByName(customer, input);
        }

        System.out.println("Please enter tonnage");
        int tonnage = Integer.valueOf(scanner.nextLine());
        System.out.println("Please write pit number");
        
    }



}



