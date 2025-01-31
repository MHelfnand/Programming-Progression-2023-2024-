package com.company;
import java.util.Scanner;

public class test {
   /* public static void main(String[]args)
    {
        int i=2;

            while(i>0) {
                i=i-1;
                if (i == 0) {
                    System.out.println("zero");

                }else{
                    System.out.println(i);
                    i=i-1;

                }
            }

*/

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1=input.nextInt();
        int n2=input.nextInt();
        for(int i=1; i<11; i++)
        {
            int result= (int)(Math.random()*(n2-n1+1)+n1);
            System.out.println("result="+result);
        }



    }







}
