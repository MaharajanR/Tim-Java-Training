package com.maharajan;

class Vehicles {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public String getName() {
        return name;
    }

    public Vehicles(String name) {
        this.name = name;
    }

    public void startEngine(String carName) {
        this.engine = true;
        System.out.println("Engine started = " + carName);
    }

    public void accelerate(String carName) {
        System.out.println("start Accelerate = " + carName);
    }

    public void brake(String carName) {
        System.out.println("Brake applied = " + carName);
    }
}

class Swift extends Vehicles {
    public Swift() {
        super("Swift Desire");
    }

    @Override
    public void accelerate(String name) {
        System.out.println("Swift is accelerated" + name);
    }
}

class Bmw extends Vehicles {
    public Bmw() {
        super("BMW X4");
    }

    @Override
    public void brake(String carName) {
        System.out.println("Brake applied for the car = " + carName);
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        System.out.println("Hi");
        Bmw bmw = new Bmw();
        Swift swift = new Swift();
        System.out.println("Car name : " + bmw.getClass().getSimpleName());
        bmw.accelerate(bmw.getName());
        bmw.brake(swift.getName());
    }
}
