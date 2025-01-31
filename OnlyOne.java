package com.company;
import java.util.Scanner;

public class OnlyOne {
    final static int N = 15;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n1 = new int[N];
        int[] n2 = new int[N];
        System.out.println("enter numbers for the array so that there will be a duplicate of each number.");
        for (int i = 0; i < N; i++) {

            n1[i] = input.nextInt();
        }
        int count = 0;
        n2[count] = n1[0];
        count++;
        boolean flag;
        for (int i = 0; i < N; i++) {
            flag = false;
            for (int j = 0; j < N; j++) {
                if (n1[i] == n2[j]) {
                    flag = true;
                }
                if (!flag) {
                    n2[count] = n1[i];
                    count++;
                }
            }

        }
        System.out.println("all the numbers in the array are:\n");
        for (int i = 0; i < count; i++) {
            System.out.println(n1[i] + "\n");
        }


    }
}
