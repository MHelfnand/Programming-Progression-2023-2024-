package com.company;
import java.util.Scanner;
public class Switching_Variables_Around {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("this is task one");
        i = input.nextInt();
                                                            if (i == 1) {
                                                                System.out.println("Welcome");
                                                                int y, x, temp;

                                                                for (i = 0; i < 10; i++) {
                                                                    x = input.nextInt();
                                                                    y = input.nextInt();

                                                                    y = x + y;
                                                                    x = y - x;
                                                                    y = y - x;
                                                                    System.out.println(" x = " + x + " y = " + y);
                                                                    if (x >= y) {
                                                                        temp = x;
                                                                        x = y;
                                                                        y = temp;
                                                                        System.out.println(" x = " + x + " y = " + y);
                                                                    }
                                                                }
                                                            }
        System.out.println("this is task two");
        i = input.nextInt();
                                                            if (i == 2) {
                                                                System.out.println("Welcome");
                                                                int  y, x, sod, mul, a, b;
                                                                for (i = 0; i < 10; i++) {
                                                                    mul = input.nextInt();
                                                                    a = input.nextInt();
                                                                    b = input.nextInt();

                                                                    y = a * mul;
                                                                    x = b * mul;

                                                                    if (x > 9) {
                                                                        System.out.println("I am here");
                                                                        sod = x % 10;
                                                                        y = y + x / 10;
                                                                        int tot = y * 10 + sod;
                                                                        System.out.println("total = " + tot);
                                                                    } else
                                                                        System.out.println("no");
                                                                }
                                                            }
        System.out.println("this is task three");
        i = input.nextInt();
                                                            if (i == 3) {
                                                                System.out.println("Welcome");
                                                                for (i = 0; i < 10; i++) {
                                                                    int n1,n2;
                                                                    System.out.println("enter two numbers");
                                                                    n1=input.nextInt();
                                                                    n2=input.nextInt();
                                                                    if(n1>0 && n2>0)
                                                                        System.out.println("positive");
                                                                    System.out.println("end");
                                                                }
                                                            }
        System.out.println("this is task four");
        i=input.nextInt();
                                                            if(i == 4) {
                                                                System.out.println("Welcome");
                                                            int win, los;
                                                            System.out.println("enter how many wins you have and then your losses");
                                                            win = input.nextInt();
                                                            los = input.nextInt();
                                                            if(win > 6 && los < 5) {
                                                                System.out.println("Your team will advance");
                                                            }else
                                                                System.out.println("You are a failure");

                                                            }
        System.out.println("this is task five");
        i=input.nextInt();
                                                            if(i == 5) {
                                                                System.out.println("Welcome");
                                                                for (i = 0; i < 10; i++) {
                                                                    int n1, n2;
                                                                    System.out.println("enter two numbers");
                                                                    n1 = input.nextInt();
                                                                    n2 = input.nextInt();
                                                                    if (n1 > 0 && n2 > 0)
                                                                        System.out.println("positive");
                                                                    if (n1 > 0 || n2 > 0)
                                                                        System.out.println("hello");
                                                                    if (!(n1 > n2))
                                                                        System.out.println("not big");
                                                                    System.out.println("end");
                                                                }
                                                            }
    }
}