package com.maharajan;

public class Vehicle {
    private String modal;

    public Vehicle(String modal) {
        this.modal = modal;
    }

    public void steering() {
        System.out.println("Vehicle class :: steering method called");
    }

    public void gears() {
        System.out.println("Vehicle class :: gears method called");
    }

    public void moving() {
        System.out.println("Vehicle class :: moving method called");
    }
}
