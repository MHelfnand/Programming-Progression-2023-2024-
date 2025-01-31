package com.company;

import java.util.Scanner;


public class Boat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P, Bt, pr;

        System.out.println("How many People are here today?");
        P = input.nextInt();

        if (P%8 == 0) {
            Bt = P / 8 ;
        }
        else {
            Bt = P / 8 + 1;
        }
    pr = Bt * 30;
    System.out.println("For "+P+" people/person, you're gonna need "+Bt+" boat/s.");
    System.out.println("\nAnd your total is "+pr+" shekels.");

    }
}