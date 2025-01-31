package com.company;
import java.util.Scanner;
public class forloop {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int num,count,i;
        System.out.println("enter two natural numbers to find the sum");
        count= input.nextInt();
        num=input.nextInt();
        boolean D=(count>num);
        int sum;
        if(D){
            sum=0;
            for(i=num; i<=count; i++) {

                sum = sum + i;
            }
            System.out.print(sum+"=(");
            for(i=num; i<=count; i++)
                if(count==i){
                    System.out.print(i);
                }else
            System.out.print(i+"+");
        }
        else {
            sum = 0;
            for (i = count; i <= num; i++)

                sum = sum + i;

            System.out.print(sum + "(");
            for (i = count; i <= num; i++)

                if (num == i) {
                    System.out.print(i);
                } else
                    System.out.print(i + "+");

        }
        System.out.print(" = "+sum+")");
    }
    }

