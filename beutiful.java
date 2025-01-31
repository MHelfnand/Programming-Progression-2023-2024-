package com.company;

import java.util.Scanner;

public class beutiful {
    final static int N = 15;
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int[] yefe = new int[N];
        for(int i=0;i<yefe.length;i++){
            System.out.println("enter number");
            yefe[i]=input.nextInt();
        }
        boolean flag=true;

        for(int i=0;i<N-3;i++){
            if(yefe[i]!=yefe[i+3])
                flag=false;
        }
        if(!flag)
            System.out.println("false");
        else
            System.out.println("beautiful");
    }
}
