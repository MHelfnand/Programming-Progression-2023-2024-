package com.company;

public class repeat {
    public static void main(String[] args) {
       int x=1, z;
        for(int i=0; i<5; i++){

            System.out.print(x);
            for(int y=x;y>0;y--){
                System.out.print("X");
            }
            System.out.println("\n");
            x++;
        }

        for(int g=0;g<6;g++){
            z=1;
            for(int w=g;w>0;w--){
                if(g>=2){

                    System.out.print(z);
                    z++;
                }
                else
                    System.out.print(z);
            }
            System.out.println("\n");


        }






    }




}
