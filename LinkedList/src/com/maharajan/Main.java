package com.maharajan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        inOrderPlaces(placeToVisit, "A");
        inOrderPlaces(placeToVisit, "W");
        inOrderPlaces(placeToVisit, "E");
        inOrderPlaces(placeToVisit, "D");
        inOrderPlaces(placeToVisit, "F");
        inOrderPlaces(placeToVisit, "B");
        printPlaces(placeToVisit);
        inOrderPlaces(placeToVisit, "M");
        inOrderPlaces(placeToVisit, "L");
        printPlaces(placeToVisit);
        visitingPlace(placeToVisit);
    }

    private static void printPlaces(LinkedList<String> placeToVisit) {
        Iterator<String> i = placeToVisit.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visit = " + i.next());
        }
        System.out.println("===============");
    }

    private static boolean inOrderPlaces(LinkedList<String> linkedList, String cityName) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(cityName);
            if (comparison == 0) {
                System.out.println("Letter already exist");
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(cityName);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(cityName);
        return true;
    }

    private static void visitingPlace(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No Cities visited yet");
        } else {
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }
        boolean goingForward = true;
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vocation) over ");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are in the starting level");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions : \n Press ");
        System.out.println("0 - to Quit \n" +
                "1 - go to next char \n" +
                "2 - go to previous char\n" +
                "3 - print Menus");
    }

}
