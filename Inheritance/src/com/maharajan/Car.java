package com.maharajan;

public class Car extends Vehicle {
    private String name;
    private String color;
    private int doors;

    public Car(String modal, String name, String color, int doors) {
        super(modal);
        this.name = name;
        this.color = color;
        this.doors = doors;
    }

    public void changingGears(int gear) {
        System.out.println("Car called :: changingGears called " + gear);
        gears();
    }

    public void speed(int speed) {
        System.out.println("Car called :: speed called " + speed);
        moving();
    }
}
