package com.company;

import java.util.Scanner;


public class Camp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cmp, gd;

        System.out.println("How many kids are in camp?");
        cmp = input.nextInt();

        if (cmp%10 == 0) {
            gd = cmp / 10 ;
        }
        else {
            gd = cmp / 10 + 1;
        }

    System.out.println("\n cmp = " + cmp);
    System.out.println("\nfor "+ cmp +" kid/s you need "+ gd +" counselor/s");

    }
}