package com.company;
import java.util.Scanner;
public class Matrix_square_sum {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int row=491,col=67,num;

        int [][] arr = new int [row][col];
        for(int k=0;k<arr.length;k++) {
            System.out.println("enter the numbers for row " + k);
            for (int j = 0; j < arr[0].length; j++) {
                arr[k][j]=input.nextInt();
            }
        }
        System.out.println("enter number");
        num=input.nextInt();
        int count=0;
        for(int k=0;k<arr[0].length-2;k++) {
            for (int j = 0; j < arr.length-2; j++) {
                if(t_square(arr,k,j,num))
                    count++;
            }
        }
        System.out.println("there are "+count+" squares that are greater than your number");
    }
    public static boolean t_square(int [][] arr, int k, int j, int num){
        int sum=0;
        for(int i=0;i<3;i++) {
            sum += arr[k + i][j + i];
            sum += arr[k + i][j];
            sum+=arr[k][j+i];
            if(i==2){
                sum+=arr[(k+i)-1][j+i];
                sum+=arr[k+i][(j+i)-1];
            }
        }
        return sum > num;
    }
}
