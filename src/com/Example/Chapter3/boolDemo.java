package com.Example.Chapter3;

public class boolDemo {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("b is "+b);
        b=true;
        System.out.println("b is "+b);
        //One can control the if statement using boolean values
        if(b) {
            System.out.println("b is true");
        }
        else
        {
            System.out.println("This is not executed");
        }
        //Outcome of a relational operator is a boolean value
        b=10<9;
        System.out.println("b is "+b);

    }
}
