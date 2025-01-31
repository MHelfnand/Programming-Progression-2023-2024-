package com.company;

public class test2 {

    public static void main (String[]args){
        String str="abcabc";
        System.out.println(isDouble(str));
    }


    public static boolean isDouble(String str){
        int half = (str.length())/2;
        for(int i=0;i<half;i++){
            System.out.println(str.charAt(i)+" "+str.charAt(i+half));
            if(str.charAt(i)<str.charAt(i+half))
                return false;
        }
        return true;
    }







}
