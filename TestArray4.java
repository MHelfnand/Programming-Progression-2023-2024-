package com.company;
import java.util.Scanner;

public class TestArray4
{
    final static int N=6;
    public static void main(String[] args)
    {
        int [] a=new int [N];
        int [] b=new int [N];
        int [] c=new int [2*N];
        kelet(a);
        kelet(b);
        int count=newArray(a,b,c);
        pelet(c,count);
    }
    public static void kelet( int [] x)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0; i<N; i++)
        {
            System.out.println("enter item "+i);
            x[i]=input.nextInt();
        }
    }
    public static void pelet(int [] ar, int count)
    {
        System.out.println("The numbers in array:");
        for(int i=0; i<count; i++)
            System.out.println(" "+ar[i]);
    }
    public static int newArray(int [] a,int [] b,int [] c)
    {
        int count=0;

        for(int i=0; i<N; i++) {
            c[count] = a[i];
            count++;
        }
        boolean flag;
        for(int j=0;j<N;j++){
            flag= false;
            for(int k=0;k<N;k++){
                if(b[j]==a[k]){
                    flag =true;
                }
                if(!flag){
                    c[count]=b[j];
                    count++;
                }

            }
        }
        return count;
    }
}