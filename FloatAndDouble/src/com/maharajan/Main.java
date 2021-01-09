package com.maharajan;

public class Main {

    public static void main(String[] args) {
        int intValue = 5;//length 7 // width is 32 //4 bytes
        float floatValue = 5f;//length 7 // width is 32 //4 bytes
        double doubleValue = 5d;//length 16// width is 64 // 8 bytes
        System.out.println("intValue =" + intValue);
        System.out.println("floatValue =" + floatValue);
        System.out.println("doubleValue =" + doubleValue);

        double pound = 200d;
        double totalKg = pound * 0.45359237d;
        System.out.println(pound + " pound is equal to " + totalKg + " kilograms");
    }
}
