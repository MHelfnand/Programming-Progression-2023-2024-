package com.company;
import java.util.Scanner;
public class N_Queens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give board length");
        int n = input.nextInt(), count =0;
        boolean[][] queen = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println("i="+i);
            count += Solution(1, 0,0, Fill(0, i, queen));
            System.out.println("solution count="+count);
            for (int k = 1; k < queen.length; k++) {
                for (int j = 0; j < queen.length; j++) {
                    queen[k][j] = false;
                }
            }
        }
        System.out.println("there are "+count+" solutions");
    }
    public static int Solution(int k, int n, int count, boolean[][] queen) {
        System.out.println("k="+k+", n="+n+", count="+count);
        if (n == queen.length) {
            return 0;
        }
        if (count == queen.length-1) {
            return 1;
        }
        for (int i = 0; i < queen.length; i++)
            for (int j = 0; j < queen.length; j++)
                System.out.println("pos"+i+", "+j+" "+queen[i][j]);

        if (!queen[k][n]) {
            return Solution(k + 1,0, count + 1, Fill(k,n,queen)) + Solution(k, n + 1, count, queen);
        }
        else
            return Solution(k, n + 1, count, queen);
    }

    public static boolean[][] Fill(int k, int n, boolean[][] queen) {
        int x = k, y = n;

        while (x < queen.length) {
            queen[x][y] = true;
            x++;
        }
        x = k;
        while (x < queen.length && y < queen.length) {
            queen[x][y] = true;
            x++;
            y++;
        }
        x = k;
        y = n;
        while (x < queen.length && y >= 0) {
            queen[x][y] = true;
            x++;
            y--;
        }
            return queen;
    }
}