package com.company;

public class allthere {
    public static void main(String[] args) {
        int [] arr = {11111111,9,8,7};
        System.out.println(allis(arr));
        System.out.println(targil1(arr));
    }

    public static boolean allis(int [] arr){
        if(arr.length<2)
            return  true;
        int num = arr[0];
        while(num!=0){
            if(isthere(num%10,arr))
                return true;
            num=num/10;
        }
        return false;
    }
    public static boolean isthere(int x, int [] arr){
        for(int i =1;i<arr.length;i++){
            int num = arr[i];
            boolean G = false;
            while(num!=0){
                G = G || (num%10==x);
                num=num/10;
            }
            if(!G){
                return false;
            }
        }
        return true;
    }

    public static boolean targil1(int[] a)
    {
        for (int i = 0; i < 10; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if(digitIn(a[j], i))
                    count++;
            }
            if(count==a.length)
                return true;
        }
        return false;
    }
    public static boolean digitIn(int num, int digit)
    {
        while(num!=0)
        {
            if(digit==num%10)
                return true;
            num=num/10;
        }
        return false;
    }
}
