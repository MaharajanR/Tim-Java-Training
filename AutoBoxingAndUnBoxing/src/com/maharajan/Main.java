package com.maharajan;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        bank.addBranch("Velachery");
        bank.addCustomer("Velachery", "Maharajan", 100);
        bank.addCustomer("Velachery", "Raja", 50);
        bank.addCustomerTransaction("Velachery", "Maharajan", 20.01);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "rag", 50000.05);
        bank.listCustomer("Velachery", true);
        bank.listCustomer("Sydney", false);
    }
}
