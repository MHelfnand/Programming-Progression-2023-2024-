package com.company;

import java.util.Scanner;


public class Triangle_Scompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int S1, S2, S3;

        System.out.println("enter three side lengths.");
            S1 = input.nextInt();
        S2 = input.nextInt();
        S3 = input.nextInt();

        if (S1 + S2 > S3)
            System.out.println("triangle");
        else
            if(S2 + S3 > S1)
                System.out.println("triangle");
            else
                if(S1 + S3 > S2)
                    System.out.println("triangle");
                else
                    System.out.println("not triangle");
        }
    }

