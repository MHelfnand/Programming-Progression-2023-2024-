package com.company;

public class classic {
    public static void main(String[]args){
        System.out.println(func2());


    }
    public static double func2(){
        double x;
        x=Math.random();
        return(x+func1(x));

    }
    public static double func1(double a){

        return (a+1);
    }







}


