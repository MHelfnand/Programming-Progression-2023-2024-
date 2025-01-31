package com.company;

public class tri_List {
    public static void main(String[]args){
        IntNode lst =null;

    for(int i=0;i<3;i++)
    {
        lst=new IntNode(2,lst);
        lst=new IntNode(5,lst);
        lst=new IntNode(3,lst);
        lst=new IntNode(7,lst);


    }
    System.out.println(tri_check(lst));

    }
    public static boolean tri_check(IntNode lst){
        if(lst==null) return false;
        if(count(lst)%3!=0) return false;
        int x = count(lst)/3;
        IntNode l1=lst;
        IntNode l2=lst;
        IntNode l3 =lst;
        for(int i=0;i<x;i++){
            l2=l2.getNext();
        }
        for(int i=0;i<x*2;i++){
            l3=l3.getNext();
        }
        for(int i=0;i<x;i++){
            if(!(l1==l3)&&(l1==l2)) return false;
            l1=l1.getNext();
            l2=l2.getNext();
            l3=l3.getNext();
        }

        return true;
    }
    public static int count(IntNode lst){
        if(lst==null)return 0;

        return 1 + count(lst.getNext());

    }





















}
