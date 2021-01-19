package com.brycelooyenga.bank;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (branches.add(new Branch(name))) {
            return true;
        }
        return false;
    }


    public boolean addCustomer(String branchName, String customerName, double intialTranscation) {
        Branch foundBranch = findBranch(branchName);

        if (foundBranch != null) {
            foundBranch.newCustomer(customerName, intialTranscation);
            return true;
        }
 return false;    }


    public Branch findBranch(String branchName) {
        for (Branch branch : branches) {

            if (branch.getName().equals(branchName)) {
                //System.out.println("found branch");
                return branch;
            }
        }

        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName,  double transaction) {

        Branch foundBranch = findBranch(branchName);
        Customer foundCustomer = foundBranch.findCustomer(customerName);
        int oldSize = foundCustomer.getTransactions().size();
        foundCustomer.addTransaction(transaction);
        if ((oldSize + 1) == foundCustomer.getTransactions().size()) {
            return true;
        }

        return false;

    }


    public boolean listCustomers(String branchName, boolean printTranscations) {

        if (findBranch(branchName) != null) {
            Branch foundBranch = findBranch(branchName);
            Customer found = null;
            if (printTranscations) {
                System.out.println("Customer details for branch " + branchName);
                for (int i = 0; i < foundBranch.getCustomers().size(); i++) {
                    found = foundBranch.getCustomers().get(i);
                    System.out.println("Customer: " +
                           found.getName() + "[" + (i + 1) +"]");
                    System.out.println("Transactions:");
                    for (int j = 0; j < found.getTransactions().size(); j++) {
                        System.out.println("Amount $" +
                                found.getTransactions().get(j));

                    }
                }
            } else {

                for (int i = 0; i < foundBranch.getCustomers().size(); i++) {
                    System.out.println("Customer: " + foundBranch.getCustomers().get(i).getName()
                            + "[" + (i + 1) + "]");
                }
            }

            return true;

        }

  return false;  }



}
