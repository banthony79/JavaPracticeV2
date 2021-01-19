package com.brycelooyenga.bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (customers.add(new Customer(customerName, transaction))) {
            return true;
        }
    return false; }


    public Customer findCustomer(String customerName) {
        for (Customer customer: customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
   return null;  }



}
