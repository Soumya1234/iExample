package com.Example.Chapter3;

//This class demonstrates the usage of the "long" type integer
public class Light
{
    public static void main(String[] args)
    {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //Approximate speed of light in miles per second
        lightspeed=186000;
        days=1000;
        seconds=days*24*3600;
        distance=lightspeed*seconds;
        System.out.println("In "+days+" days, light will travel about "+distance+" miles.");
    }
}


