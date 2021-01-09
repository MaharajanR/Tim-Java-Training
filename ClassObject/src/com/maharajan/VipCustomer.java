package com.maharajan;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default name", 100.0d, "maha@email.com");
        System.out.println("Default constructor called from vip customer");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 100.0d, emailAddress);
        System.out.println("2nd Constructor called");

    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println(" constructor called from vip customer");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
