package com.company;
import java.util.Scanner;
public class goodStudent {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int[] n1 = new int[80];
        int[] n2 = new int[20];
       for(int i=0;i<20;i++){
           n2[i]=0;
       }
        System.out.println("enter the number of classes each of the 80 kids is taking from 6-25.");
        for(int i=0;i<80;i++){
            n1[i]= input.nextInt();
        }
        for(int i=0;i<80;i++){
            if(n1[i]<=25 && n1[i]>=6){
                n2[n1[i]-6]++;
            }
        }
        for(int i=0;i<20;i++){
            System.out.println("\t"+(n2[i])+" outstanding students took\n"+(i+6)+" courses\n");
        }


    }
}
