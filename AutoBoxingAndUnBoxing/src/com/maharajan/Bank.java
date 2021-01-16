package com.maharajan;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialamount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialamount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomer(String customerName, boolean showTransactions) {
        Branch branch = findBranch(customerName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomerArrayList();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transaction ");
                    ArrayList<Double> transactionList = branchCustomer.getTransactions();
                    for (int j = 0; j < transactionList.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactionList.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
