package com.company;

public class nodes {
    public static void main(String[] args) {


        int amount = (int)(Math.random() * 20 - 10 + 1) + 1;
        IntNode lst = null;
        for (int i = 0; i < amount; i++) {
            lst = new IntNode((int)(Math.random() * 20 - 10 + 1) + 1, lst);
        }
        IntNode run = lst;
        int sum = 0;
        while (run != null) {
            System.out.println(run.getValue());
            sum += run.getValue();
            run = run.getNext();
        }
        System.out.println("sum = " + sum);

        int max = lst.getValue();
        run = lst.getNext();
        while (run != null) {
            if (run.getValue() > max) {
                max = run.getValue();
            }
            run = run.getNext();
        }
        System.out.println("max = " + max);

        int extra = (int)(Math.random() * 20 - 10 + 1) + 1;
        int count = 0;
        run = lst;
        while (run != null) {
            if (run.getValue() == extra)
                count++;
            run = run.getNext();
        }
        System.out.println("count = " + count);

        sum = 0;
        run = lst;
        while (run != null) {
            if (run.getValue()%2 == 0)
                sum+=run.getValue();
            run = run.getNext();
        }
        System.out.println("sum ="+ sum);

        count =0;
        sum = 0;
        run = lst;
        while (run != null) {
            count++;
            sum += run.getValue();
            run = run.getNext();
        }
        int ave = sum/count;
        System.out.println("average = " + ave);

        int small =0;
        int big = 0;
        run = lst;
        while (run != null) {
            if (run.getValue()>ave)
                big++;
            if (run.getValue()<ave)
                small++;
            run = run.getNext();
        }
        System.out.println("bigger ="+big+", small ="+small);

         int k = (int)(Math.random() * 20 - 10 + 1) + 1;
         count = 0;
        run = lst;
        while (run != null) {
            count++;
            if (run.getValue() == k)
                System.out.println("place of k = " + count);
            run = run.getNext();
        }

        int num = 92;
        IntNode split=null;
        while(num!=0){
            lst = new IntNode(num%10, lst);
            num=num/10;
        }







    }
}