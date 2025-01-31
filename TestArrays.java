package com.company;
import java.util.Scanner;
public class TestArrays {
    public static void main(String[] args) {
        int [] first;
        first = new int [6];
        kelet(first);
        pelet(first);

    }
    public static void kelet(int [] x)
    {
        Scanner input=new Scanner (System.in);
        for(int i = 0; i<6;i++)
        {
            System.out.println("enter item"+i);
            x[i]=input.nextInt();
        }
    }
    public static void pelet(int [] ar)
    {
        System.out.println("the number in the array:");
        for(int i=0;i<6;i++)
        {
            System.out.println("item number"+i+"is"+ar[i]);

        }

    }

}
