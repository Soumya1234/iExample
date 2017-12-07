package com.otherExample;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSystem {

    private static int[] getBinarySum(int[] a,int[] b)
    {
        int[] result=new int[8];
        int cf=0;
        /*Initialize carry forward array with zeros */
        int i=7;
        while(i>=0)
        {
            if((a[i]+b[i]+cf)==2)
            {
                result[i]=0;
                cf=1;
            }
            else if ((a[i]+b[i]+cf)==1)
            {
                result[i]=1;
                cf=0;
            }
            else if ((a[i]+b[i]+cf)==3)
            {
                result[i]=1;
                cf=1;
            }
            i--;
        }
        return result;
    }

    private static int[] getOnesComplement(int[] a)
    {
        int[] result=new int[8];
        for(int i=0;i<8;i++)
        {
            if(a[i]==0)
            {
                result[i]=1;
            }
            else
            {
                result[i]=0;
            }
        }
        return result;
    }

    private static int[] getTwosComplement(int[] a)
    {

       int[] result=new int[8];
       for(int i=0;i<7;i++)
        {
            int[] rhs={0,0,0,0,0,0,0,1};
            result=getBinarySum(getOnesComplement(a),rhs);
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer input:");
        Scanner scanner=new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());
        int a=input;
        if(input<0)
        {
            a=0-input;
        }
        int binary[]=new int[8];
        char output[]=new char[8];
        for (int i=0;i<8;i++)
        {
            binary[i]=0;
            output[i]=(char)(binary[i]+48);
        }
        //System.out.println((Arrays.toString(binary)));
        int i=7;
        while(a!=0)
        {
            binary[i]=a%2;
            a/=2;
            i--;
        }
        System.out.println((Arrays.toString(binary)));
        if(input<0)
        {
            binary=getTwosComplement(binary);
        }
        for(int x=0;x<8;x++)
        {
            output[x]=(char)(binary[x]+48);
        }

        /*
        for(int j=0;j<8;j++)
        {
            System.out.println("\t");
            System.out.println(binary[j]);
        }
        */
        System.out.println(output);
    }
}
