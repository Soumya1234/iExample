package com.Example.Chapter3;

import java.util.Scanner;

public class oneDimensionalArrayDemo {
    public static void main(String[] args) {
        char array[]; //Defining an array variable of type 'int'
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        array=new char[input.length()];
        for (int i=0;i<input.length();i++)
        {
            array[i]=input.charAt(i);
        }
        System.out.println(array);
    }

}
