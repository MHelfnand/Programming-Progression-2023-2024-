package com.company;

public class new_rangenode {
    public static void main(String[]args){






    }




    public static Node<RangeNode> MakeNewRange(Node<Integer> lst){
        Node<RangeNode>list = new Node<>(new RangeNode(0, 0));
        Node<RangeNode> prev = list;
        int from=0;
        int to=0;
        from=lst.getValue();
        while(lst.getNext()!=null){
            to=lst.getValue();
            if(lst.getValue()+1!=lst.getNext().getValue()){
                prev.setNext(new Node<>(new RangeNode(from, to)));
            }
            lst=lst.getNext();
        }
        to = lst.getValue();
        prev.setNext(new Node<>(new RangeNode(from, to)));

        return list.getNext();

    }








}
