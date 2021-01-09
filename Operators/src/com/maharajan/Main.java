package com.maharajan;

public class Main {

    public static void main(String[] args) {
        //+-*%=
        double firstDouble = 20d;
        double secondDouble = 80d;
        double sumDouble = firstDouble + secondDouble;
        System.out.println("sumDouble is = " + sumDouble);


        double multiplyDouble = sumDouble * 25;
        System.out.println("multiplyDouble is = " + multiplyDouble);

        double remainder = multiplyDouble % 40;

        System.out.println("remainder is = " + remainder);

        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }


    }
}
