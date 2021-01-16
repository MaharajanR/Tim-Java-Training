package com.maharajan;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Desire", "Swift", "Red", 4);
        car.changingGears(5);
        car.steering();
        car.speed(10);
    }
}