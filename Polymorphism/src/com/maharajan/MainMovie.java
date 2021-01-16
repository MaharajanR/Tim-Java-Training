package com.maharajan;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void plot() {
        System.out.println("No Plot  here....");
    }

    public String getName() {
        return name;
    }
}

class Master extends Movie {

    public Master() {
        super("Master");
    }

    @Override
    public void plot() {
        System.out.println("Master was awesome");
    }
}

public class MainMovie {

    public static void main(String[] args) {
        Master master = new Master();
        master.plot();
        System.out.println("Movie Name is = ");
    }
}
