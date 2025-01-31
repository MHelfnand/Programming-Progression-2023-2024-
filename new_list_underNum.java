package com.company;

public class new_list_underNum {


    public static IntNode lstUnderNum(IntNode lst, int num) {
    IntNode l1 =new IntNode(0);
    for(int i=1;i<num;i++){
        l1 = new IntNode(1,lst);
    }
    while(lst.hasNext()){
        remove(l1,lst.getValue());
    }
    return l1;
    }
    public static void remove(IntNode lst, int num){
        IntNode prev = null;
        IntNode pos = lst;
        while(pos!=null){
            if(pos.getValue()==num){
                prev.setNext(pos.getNext());
            }
            prev=pos;
            pos=pos.getNext();
        }
    }

}
