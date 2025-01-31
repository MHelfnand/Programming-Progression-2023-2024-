package com.company;
import java.util.Scanner;
public class FootBall {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int [] day1 = new int [4];
        int [] day2 = new int [4];
        int [] day3 = new int [4];

        for(int play=0; play<4; play++)
        {
            System.out.println("enter the number goals for day:"+1+"                                                                                  play:"+(play+1));
            day1[play]=input.nextInt();
        }
        for(int play=0; play<4; play++)
        {
            System.out.println("enter the number goals for day:"+2+  " play:"+(play+1));
            day2[play]= input.nextInt();
        }
        for(int play=0; play<4; play++)
        {
            System.out.println("enter the number goals for day:"+3                                                                     +" play:"+(play+1));
            day3[play]= input.nextInt();
        }
        for (int play = 0; play < 4; play++)
            System.out.print(" "+day1[ play ]) ;
        System.out.println("");

        for (int play = 0; play < 4; play++)
            System.out.print(" "+day2[ play ]) ;
        System.out.println("");

        for (int play = 0; play < 4; play++)
            System.out.print(" "+day3[ play ]) ;

        play();
    }
public static void play() {
    {
        Scanner input = new Scanner(System.in);
        int[][] goals = new int[3][4];

        for (int day = 0; day < 3; day++)
            for (int play = 0; play < 4; play++) {
                System.out.println("enter the number goals for day:" +
                        (day + 1) + " play:" + (play + 1));
                goals[day][play] = input.nextInt();
            }

        for (int day = 0; day < 3; day++) {
            for (int play = 0; play < 4; play++)
                System.out.println(" " + goals[day][play]);
            System.out.println("");
        }
        System.out.println("goals scored in the first game of first day was"+goals[0][0]);
        System.out.println("goals scored in the first game of second day was"+goals[1][0]);
        System.out.println("goals scored in the second game of third day was"+goals[2][1]);
        System.out.println("goals scored in the third game of third day was"+goals[2][2]);
        System.out.println("\n\n wait theres been a mix up\n");
        goals[2][0]=5;
        goals[1][0]=0;
        System.out.println("goals scored in the first game of third day was"+goals[2][0]+"\n");
        System.out.println("and the goals scored in the first game of second day was"+goals[2][0]);


    }
    }



}
