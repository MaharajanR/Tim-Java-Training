package com.maharajan;

import java.util.ArrayList;

public class Groceries {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryList(int position, String grocery) {
        groceryList.set(position, grocery);
    }

    public void displayGroceryList() {
        System.out.println("Total grocery list " + groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Groceries are " + i + " name is " + groceryList.get(i));
        }
    }

    public void addGroceries(String product) {
        System.out.println("Adding items called " + product);
        groceryList.add(product);
    }

    public void findAndRemoveGrocery(String itemName) {
        int position = findGrocery(itemName);
        if (position >= 0) {
            String item = groceryList.get(position);
            System.out.println("Removed items called" + item);
            groceryList.remove(position);
        } else {
            System.out.println("Item Not found " + itemName);
        }

    }

    public void findAndModifyGrocery(String oldItemName, String newItemName) {
        int position = findGrocery(oldItemName);
        if (position >= 0) {
            String item = groceryList.set(position, newItemName);
            System.out.println("Modified items for" + oldItemName + "Now New item added is = " + newItemName);
            groceryList.remove(position);
        } else {
            System.out.println("Item Not found " + oldItemName);
        }

    }

    public int findGrocery(String itemName) {
        System.out.println("Finding item ...." + itemName);
        return groceryList.indexOf(itemName);
    }

}
