package com.company;
import java.util.Scanner;


public class sum_and_difference {


    static Scanner input = new Scanner(System.in);

    public static void main(String[]args)
    {



         }
    public static int stuff(int num1, int num2) {
        int sum = 0;

        while (num1 > 0) {
            sum = sum + Math.abs(num1 % 10 - num2 % 10);
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return sum;


    }
public static void q2(){
        int num, sum=0;

        System.out.println("enter a number");
        num = input.nextInt();
        int numn = num%10;
        while(num>0){
            if(num%10<numn)
                sum=sum+1;

                num=num/10;



        }
    System.out.println("there are"+sum);



}

}