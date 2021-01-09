package com.maharajan;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println("Balance =  " + bankAccount.getBalance());
        bankAccount.withdrawFunds(500);

        VipCustomer vipCustomer = new VipCustomer("Maha", "maha@gmail.com");
        System.out.println("VipCustomer credit limit = " + vipCustomer.getCreditLimit());
        System.out.println("VipCustomer name limit = " + vipCustomer.getName());
    }
}
