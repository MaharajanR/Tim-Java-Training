package com.maharajan;

public class Main {

    public static void main(String[] args) {
        double inch = 157d;
        //double feet = 6.0d;
        // double returnFeet = calcFeetAndInchesToCentimeters(feet, inch);
        double returnCentimeter = calcFeetAndInchesToCentimeters(inch);
        System.out.println("returnCentimeter = " + returnCentimeter);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((inches < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid parameter");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = " + centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameter");
            return -1;
        }
        double feet = (int) inches / 12;
        double reminderInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to = " + feet + " feet and " + reminderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, reminderInches);
    }


}
