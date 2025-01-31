package com.company;
import java.util.Scanner;
public class numbercounter {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int[] n1 = new int[30];
        int[] n2 = new int[9];

        for(int i=0;i<9;i++){
            n2[i]=0;
        }
            for(int i=0;i<30;i++){
                System.out.println("enter number");
                n1[i]=input.nextInt();
            }
                for(int i=0;i<30;i++){
                    n2[n1[i]%10]++;
                }
            for(int i=0;i<9;i++){
                System.out.println(n2[i]+" numbers ending in "+i);
            }

    }

}
