package com.company;
import java.util.Scanner;
public class משימה5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double n1,n2;
        int result;
        System.out.println("enter two numbers");
        n1= input.nextDouble();
        n2=input.nextDouble();
        while(numPositive(n1,n2)>0)
        {
            System.out.println("enter two numbers");
            n1= input.nextDouble();
            n2=input.nextDouble();
        }
    }

    public static int numPositive(double a, double b)
    {
        int count=0;
        if(a>0 && b>0)
            count=2;
        else
        if(a>0 || b>0)
            count=1;
        return count;
    }
    }