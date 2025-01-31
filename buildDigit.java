package com.company;

public class buildDigit {
    public static void main(String[]args){
    Node<Integer> lst = new Node<>(92);
    lst.setNext(new Node<>(4));
    lst.getNext().setNext(new Node<>(543));
    Node<Integer> lst2 = buildList(lst);
    while(lst2!=null){
        System.out.println(lst2.toString());
        lst2=lst2.getNext();
    }
    }
    public static Node<Integer> buildList(Node<Integer> lst){
        Node<Integer> lst1 = new Node<>(999);
        Node<Integer> pos = lst1;
        while(lst!=null){
            int num= lst.getValue();
        while(num!=0) {
        pos.setNext(new Node<>(num%10));
        num=num/10;
        pos=pos.getNext();

        }
        pos.setNext(new Node<>(-9));
        pos=pos.getNext();
        lst=lst.getNext();

        }
        return lst1.getNext();

    }







}
