package com.company;

import java.util.Scanner;


public class Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int l;
int T, Ch, P, B;
        for(l=0; l < 10; l++){


                System.out.println("How many adults and children are there?");
            P = input.nextInt();
            B = input.nextInt();

            Ch = P + B;


        if (Ch % 6 == 0)
                T = Ch / 6;
        else
                T = Ch / 6 + 1;

        if (P/4>B/2) {
            if(P%4 == 0)
                T = P/4;
            else
                T = P/4 + 1;

            }

        if (B/2>P/4){
            if(B%2 == 0)
                T = B/2;
            else
                T = B/2 + 1;
            }


                System.out.println("\n"+T);
        }








    }
}