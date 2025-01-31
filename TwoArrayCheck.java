package com.company;

public class TwoArrayCheck {

    final static int N = 7;
    static int G=1;

    public static void main(String[] args) {
        int[] n1 = new int[N];
        int[] n2 = new int[N];

        num1(n1);

        num1(n2);
        num2(n1, n2);


    }

    public static void num1(int[] x) {

        for (int i = 0; i < N; i++) {
            x[i] = (int)(Math.random()*(20-10+1)+10);
        }
        System.out.println("array "+G);
        G++;
        for (int i = 0; i < N; i++){
            System.out.println(x[i]);
        }
    }

    public static void num2(int[] n1, int[] n2) {
        int count;
        for (int j = 0; j < N; j++) {
            count=0;
            for (int i = 0; i < N; i++) {
                if (n1[j] == n2[i])
                    count++;
            }
            System.out.println("the number in the "+j+" slot of the first array \n appears "+count+" time/s in the second array");
        }
    }
}

