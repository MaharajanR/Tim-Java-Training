package com.maharajan;

public class Main {

    public static void main(String[] args) {
      /*  int count = 6;
        while (count <= 5) {
            System.out.println("Count =" + count);
            count++;
        }
        count = 0;
        while (count <= 5) {
            if (count == 5) {
                break;
            }
            System.out.println("Count is =" + count);
            count++;
        }*/

        int number = 1;
//        do {
//            if(!isEvenNumber(number)){
//                number++;
//                continue;
//            }
//
//            System.out.println("isEvenNumber New" + number );
//            number++;
//        } while (number < 10);
        number = 1;
        int count = 0;
        while (number < 20) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("isEvenNumber New" + number);
            number++;
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("isEvenNumber count " + count);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
