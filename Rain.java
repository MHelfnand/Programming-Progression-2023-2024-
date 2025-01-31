package com.company;

import java.util.Scanner;


public class Rain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int J,Fe,M,A;

        System.out.println("Write down the precipitation of January, February, and March");
        J = input.nextInt();
        Fe = input.nextInt();
        M = input.nextInt();
    A = J+Fe+M/3;
        if (A > 0) {
            System.out.println("very rainy!");
        }

        System.out.println("On average it has rained "+A+"mm");

    }
}