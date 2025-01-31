package com.company;
import java.util.Scanner;
public class matrixMaxMin {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] ar = new int[4][3];

        inp(ar);
        max(ar);
        min(ar);
        System.out.println("and there are " + minus(ar) + " negative numbers");
    }

    public static void inp(int[][] ar) {
        System.out.println("enter 12 numbers");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = input.nextInt();
            }
        }
    }

    public static void max(int[][] ar) {
        int max;
        for (int i = 0; i < 4; i++) {
           max=ar[i][0];
            for (int j = 0; j < 3; j++) {
                if (ar[i][j] > max)
                    max = ar[i][j];
            }
            System.out.println("the max number in row "+(i+1)+" is "+max+",");
        }

    }

    public static void min(int[][] ar) {
        int min;
        for (int i = 0; i < 3; i++) {
           min = ar[0][i];
            for (int j = 0; j < 4; j++) {
                if (ar[j][i] < min)
                    min = ar[j][i];
            }
            System.out.println("the min number in column "+(i+1)+" is "+min+",");
        }

    }

    public static int minus(int[][] ar) {
        int count=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (ar[i][j] < 0)
                    count++;
            }

        }
        return count;
    }
}


