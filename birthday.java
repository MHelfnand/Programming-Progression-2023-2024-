package com.company;

import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, bd, theDay;
        System.out.println("enter the day today, 0-6 \n0 is saturday & 6 is friday");
        day = input.nextInt();
        if (day < 0 || day > 6) {
            System.out.println("Invalid Number!");
        } else {
            System.out.println("enter the number of days until your birthday");
            bd = input.nextInt();
            theDay = (day + bd) % 7;
            String[] daysInAWeek = {"saturday", "sunday", "monday", "tuseday", "wednesday", "thursday", "friday"};
            System.out.println("your birthday is on " + daysInAWeek[theDay]);

        }







    }

}
