package com.company;

public class pily {
    final static int N=5;
    public static void main(String[] args) {
        int[][] ar = new int[N][N];
        pil(ar);
    }
    public static void pil(int [][]ar){
        int sum=0;
        boolean flag=true;
        for(int i=0;i<N;i++){
            sum=0;
            for(int j=i+1;j<N;j++)
                sum=sum+ar[i][j];

            if(sum!=ar[i][i])
                    flag=false;

        }
        if(!flag)
            System.out.println("not pil");
        else
            System.out.println("pil");
    }
}
