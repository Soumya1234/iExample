package com.Example.Chapter3;

public class literalDemo {
    public static void main(String[] args) {

        int x=0xA;//specifying an integer literal as hexadecimal using '0x'
        int y=0b01010; //specifying an integer literal as binary using '0b'
        int z=123_456_789;//Integers can be represented by underscores (in between digits only, neither at start, not at the end)
                          //Useful for large integers
        long c=x; //legal since range of values for 'long'(64 bits) is more than 'int'(32 bits)
        //int d=c; illegal since range of 'int' is less than that of 'long'
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        //In java all floating point literals are by default "double"
        float a=1.2456f;// We are required to put 'f' after the 'float' literal to specify it as 'float' otherwise JAVA defaults it to 'double'
        //float f=1.2456; illegal as there is no 'f' after 1.2456 and thus we are trying to assign a double(64 bits) to a float(32 bits)
        float b=0x12.2p2f;
        double e=201_3435_6363_3.7_2_3; //like 'int' a floating point number can also be represented using underscores
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        /* Shows the string literal */
        String f="This program says....\'Hello, World!!\'";
        System.out.println(f);

    }
}
