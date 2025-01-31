/* package com.company;
import java.util.Scanner;
public class TestArrays3 {
    public static void main(String[] args)
    {
        int [] grade=new int [5];
        double ave;
        int big_ave;
        kelet(grade);
        pelet(grade);
        ave=average(grade);
        big_ave=big_from_num(grade,ave);
        difave (big_ave);
    }
    public static void kelet(int [] grade)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("enter grade "+i);
            grade[i]=input.nextInt();
        }
    }
    public static void pelet(int [] ar)
    {
        System.out.println("The grades are:");
        for(int i=0; i<5; i++)
            System.out.println(ar[i]);
    }
    public static double average(int [] a)
    {
        int sum=0;
        for(int i=0; i<5; i++)
            sum=sum+a[i];
        return sum/5.0;
    }
    public static int big_from_num(int [] a,double num)
    {
        int count=0;
        for(int i=0; i<5; i++)
            if(a[i]>num)
                count=count+1;
        return count;
    }
    public static int difave(int ave){
        for()


    }
}


*/