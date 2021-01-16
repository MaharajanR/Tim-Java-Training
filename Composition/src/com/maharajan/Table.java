package com.maharajan;

public class Table {
    private int legs;
    private String color;
    private Size size;

    public Table(int legs, String color, Size size) {
        this.legs = legs;
        this.color = color;
        this.size = size;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
