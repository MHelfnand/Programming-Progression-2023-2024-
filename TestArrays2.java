package com.company;
import java.util.Scanner;
public class TestArrays2 {

    final static int N = 4;
    static int max=0;

    public static void main(String[] args) {
        int[] first = new int[N];
        int[] second = new int[N];
        System.out.println("input- first array");
        kelet(first);
        System.out.println("input- second array");
        kelet(second);
        System.out.println("output- first array");
        pelet(first);
        System.out.println("output- second array");
        pelet(second);
    }

    public static void kelet(int[] x) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("enter item " + i);
            x[i] = input.nextInt();

            if(x[i]>max){
                max=x[i];}

        }
    }

    public static void pelet(int[] ar) {
        System.out.println("The numbers in array:");
        for (int i = 0; i < N; i++){
            System.out.println("item number " + i + " is " + ar[i]);
        System.out.print("\n");}
        System.out.println("the largest number in both arrays is "+max);
    }


}
