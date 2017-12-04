package com.Example.Chapter3;

public class castDemo {
    public static void main(String[] args) {
        int z=100;
        /* We are using explicit cast here because the byte is smaller compared to int */
        byte a=(byte)z;
        /* byte a=128; illegal as range of byte is from -128 to +127 */
        System.out.println(a);
        double b=1.23456677;
        /* A truncation occurs during this explicit casting */
        z=(int)b;
        System.out.println(z);
    }
}
