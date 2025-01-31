package com.company;

import java.util.Queue;

public class q {
    public static void main(String[] args){









    }
    public static int findlength(String []arr, int num){
       int count =0;
        for(int i =0; i<arr.length;i++){
            if(num==arr[i].length())
                count++;
        }
        return count;
    }
    public static int toNumbers(Queue<Integer> q){
        int num=0;
        int count=1;
        while(!q.isEmpty()){
            num+=q.remove()*count;
            count=count*10;
        }
        return num;
    }
    public static int bigNumber(Node<Queue<Integer>> lst){
        if(lst==null)
            return -1;
        int max=0,num;
        while(lst!=null){
            num=toNumbers(lst.getValue());
            if(max<num)
                max=num;
            lst=lst.getNext();
        }
        return max;
    }
    public static boolean order(BinNode<Range> tree){
        if(tree==null||isLeaf(tree))
            return true;
        if(tree.hasLeft()&&tree.hasRight())
            if(!(tree.getLeft().getValue().getHigh()<tree.getRight().getValue().getLow()))
                return false;

        if(tree.hasLeft())
            if(!((tree.getValue().getLow()==tree.getLeft().getValue().getLow())&&(tree.getValue().getHigh()>=tree.getLeft().getValue().getHigh())))
                return false;

        if(tree.hasRight())
            if(!((tree.getValue().getHigh()==tree.getRight().getValue().getHigh())&&(tree.getValue().getLow()<=tree.getRight().getValue().getLow())))
                return false;

        return (order(tree.getLeft()) && order(tree.getRight()));
    }
    public static boolean isLeaf(BinNode<Range> tree){
        if(tree==null)
            return false;
            return !tree.hasLeft()&&!tree.hasRight();
    }
}
