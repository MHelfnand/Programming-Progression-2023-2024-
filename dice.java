package com.company;

public class dice {
    public static void main(String[] args){

        int n1 ;
        int n2 ;


        for(int i=0; i<10;i++) {
            n1 = (int) (Math.random() * (6 - 1 + 1) + 1);
            n2 = (int) (Math.random() * (6 - 1 + 1) + 1);
            boolean N = ((n2 + n1) % 2 == 0);
            if (N) {
                System.out.println("n1=" + n1 + "\t n2=" + n2);
                System.out.println("the dice are evan");
            } else {
                System.out.println("n1=" + n1 + "\t n2=" + n2);
                System.out.println("the dice are odd");
            }
        }



    }






}
