package com.company;

public class numtostring {
    public static void main(String[] args) {
    System.out.println(numtoString(1058));
    }
    public static String numtoString(int num){
        int count = 1;
        String c= "";
        while(num!=0){
            if(num%10!=0) {
                int num1= (num % 10) * count;
                c = num1+" "+c;
            }
            num = num / 10;
            count = count * 10;
        }
        return c;
    }






}
