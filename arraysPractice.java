package com.company;
import java.util.Scanner;
public class arraysPractice {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] x = new int[101];
        int score;
        for(int i =0;i<101;i++) {
            x[i] = 0;
        }
        for(int i=0;i<30;i++){
            System.out.println("enter the score, 0-100.");
            score = input.nextInt();
            x[score]++;
        }

        for(int i=0;i<101;i++){
            System.out.println("students got the score "+i+", "+x[i]+" times.");
        }

    }
}
