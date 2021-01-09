package com.maharajan;

public class ByteShortIntTest {
    public static void main(String[] args) {
        // byte has width of 8
        byte byteValue = 10;

        // short has width of 16
        short shortValue = 20;

        // int has width of 32
        int intValue = 50;

        // long has width 64
        short minLong = (short) (50000L + 10L * (byteValue + shortValue + intValue));
        System.out.println("minLong = " + minLong);

    }
}
