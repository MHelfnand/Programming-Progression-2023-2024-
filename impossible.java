package com.company;
import java.util.Scanner;
public class impossible {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n1, n2;
        System.out.println("choose a number 1-9");
        n1 = input.nextInt();
        System.out.println("choose another number 1-9");
        n2=input.nextInt();
        for(int i=n1;i>0;i--)
            result(i,n2);
        for(int y=2;y<=n1; y++)
            result(y,n2);

    }
public static void result(int a, int num)
{

           for(int j=0; j<a; j++)
           {

                System.out.print(num);

           }

           System.out.println("");

             }
}







