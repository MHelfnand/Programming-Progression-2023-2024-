package com.company;

public class bagrut2017 {








    public static boolean exist(double x, BinNode<Double> bt){
        if(bt==null)
            return false;

            if (bt.getValue() == x)
                return true;

        return exist(x, bt.getLeft())||exist(x, bt.getRight());
    }

    public static Node<Integer> check(BinNode<Integer> t1, BinNode<Double> t2, Node<Integer> lst)
    {
        if(t1!=null) {
            if (!exist(t1.getValue(), t2)) {

                Node<Integer> pos = lst;
                pos.setNext(new Node<Integer>(t1.getValue()));
                pos = pos.getNext();

            }
            lst = check(t1.getLeft(), t2.getLeft(), lst);
            lst = check(t1.getRight(), t2.getRight(), lst);
        }

        return lst;
    }













}
