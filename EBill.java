package com.company;

import java.util.Scanner;


public class EBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int E;
        double p;
int i;
for(i=0;i<10;i++){
        System.out.println("enter your electricity usage");
        E = input.nextInt();
    if (E <= 180)
        p = 70 ;
    else
    if (E > 1000){
        p = 70 + 90;
        p = p + p/10;}
    else
        p = 70 + 90;



            p=p + (p/17);



            System.out.println("Your bill for electricity is "+ Math.round(p) +"                                                                                                                                                                                                                                                    ");
    }
    }
}