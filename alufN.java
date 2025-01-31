package com.company;
import java.util.Scanner;
public class alufN {
    static Scanner input = new Scanner(System.in);
    static int N;
    public static void main(String[] args) {
       System.out.println("what do you want to be the aluf number");
       N=input.nextInt();
        int[] n1 = new int[N];
      System.out.println("enter the numbers for aluf system");
       for(int i=0;i<N;i++){
           n1[i]=input.nextInt();
       }
        if(aluf(n1)){
            System.out.println("those numbers are aluf");
        }
        else
            System.out.println("those numbers are not aluf");
    }
    public static boolean aluf(int [] n1){
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(n1[i]+n1[j]+n1[k]==N)
                        count++;
                }
            }
        }
        if(count>=N)
            return true;

        return false;
    }
}
