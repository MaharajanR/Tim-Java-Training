package com.maharajan;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initAmount) {
        if (findCustomer(customerName) == null) {
            this.customerArrayList.add(new Customer(customerName, initAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double initialAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(initialAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customerArrayList.size(); i++) {
            Customer customer = this.customerArrayList.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
