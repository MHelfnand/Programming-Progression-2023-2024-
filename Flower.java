package com.company;

import java.util.Scanner;


public class Flower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int F, B;

        System.out.println("How many Flowers do you have?");
        F = input.nextInt();

        if (F%5 == 0) {
            B = F / 5 ;
        }
        else {
            B = F / 5 + 1;
        }


        System.out.println("you have "+F+" Flower/s, you need "+B+" Bouquet/s");

    }
}