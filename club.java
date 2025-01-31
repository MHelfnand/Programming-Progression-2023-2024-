package com.company;
import java.util.Scanner;
public class club {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int visit;
        System.out.println("enter visits");
        visit = input.nextInt();
        if (visit < 4)
            System.out.println("too little");
        else
        if (visit > 7 )
            System.out.println("over done");
        else
            System.out.println("well done");
    }
}