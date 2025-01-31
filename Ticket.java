package com.company;

import java.util.Scanner;


public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double o;
        int speed, points;

        System.out.println("your speed when you were pulled over\n and enter the number of points you have on your license.");

            
            speed = input.nextInt();
            points = input.nextInt();

            if (speed >= 90) {
                System.out.println("You will have to pay a bill of 500nis");

            }
            else
                if (points >= 6){
                System.out.println("You will be getting a bill and you also have to attend a drivers ed class");

                }
             else
                System.out.println("You were driving at a permitted speed");


    }

}