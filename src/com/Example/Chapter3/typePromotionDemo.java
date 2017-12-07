package com.Example.Chapter3;

/* This class demonstrates the automatic type promotion system in java */
public class typePromotionDemo {
    public static void main(String[] args)
    {
          byte a=50;
          byte b=40;
          byte c=100;
          int d= a * b/c;
          c=(byte)(a*2);
    }
}
