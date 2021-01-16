package com.maharajan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        int[] sorted = sortIntegers(myIntArray);
        printArray(sorted);

    }

    private static int[] sortIntegers(int[] myIntArray) {
        System.out.println("After sorted :::");
        int[] sortedArray = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++)
            sortedArray[i] = myIntArray[i];

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static void printArray(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++)
            System.out.println("myIntArray are " + i + " values are =" + myIntArray[i]);
    }

    private static int[] getIntegers(int number) {
        System.out.println("Please type input parameters :\r");
        int[] returnIntegers = new int[number];
        for (int i = 0; i < number; i++) {
            returnIntegers[i] = scanner.nextInt();
        }
        return returnIntegers;
    }
}
