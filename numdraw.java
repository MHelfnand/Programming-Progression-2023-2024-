package com.company;

public class numdraw {

    public static void main(String[] args){

        int n1 ;



        for(int i=0; i<12;i++) {
            n1 = (int) (Math.random() * (45 - 35 + 1) + 35);
            boolean N = (n1 != 40);
            if (N) {

                System.out.println("not bad");
            } else {

                System.out.println("40, great");
            }
        }



    }
}
