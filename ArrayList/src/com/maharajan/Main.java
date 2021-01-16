package com.maharajan;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static Groceries groceries = new Groceries();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choices");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceries.displayGroceryList();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                case 5:
                    searchItem();
                    break;
                case 6:
                    printArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    private static void printArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>(groceries.getGroceryList());
        String[] strAra = new String[groceries.getGroceryList().size()];
        strAra = groceries.getGroceryList().toArray(strAra);
    }

    private static void searchItem() {
        System.out.println("Please search item by name ");
        String itemName = s.nextLine();
        if (groceries.findGrocery(itemName) > 0) {
            System.out.println("Found " + itemName);
        } else {
            System.out.println("Not Found " + itemName);
        }
    }

    private static void removeItem() {
        System.out.println("Please enter to remove the Item: ");
        groceries.findAndRemoveGrocery(s.nextLine());
    }

    private static void modifyItem() {
        System.out.println("Please enter Old Item: ");
        String oldItem = s.nextLine();
        System.out.println("Please enter New Item: ");
        String newItem = s.nextLine();
        groceries.findAndModifyGrocery(oldItem, newItem);
    }

    private static void addGroceryItem() {
        System.out.println("Please enter the grocery item : ");
        groceries.addGroceries(s.nextLine());
    }

    public static void printInstruction() {
        System.out.println("\nPress number");
        System.out.println("\t 0 - To print choice option.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To Search the item in the list");
        System.out.println("\t 6 - To Quit the grocery application");
    }
}
