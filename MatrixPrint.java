package com.company;



public class MatrixPrint {
    static int N = 3;

    public static void main(String[] args) {

        int[][] ar = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            ar[i][i] = ar[i][1]+10;
        }
        for (int i = 0; i < N; i++) {
            ar[i][1] = ar[i][1]+20;
        }
        for (int i = 0; i < N; i++) {
            ar[2][i] = ar[i][1]+30;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               System.out.print(ar[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
