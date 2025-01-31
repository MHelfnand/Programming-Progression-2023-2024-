package com.company;

public class two_list_check {
 public static void main(String[]args){
     Node<Integer> l1 =new Node<>(6);
     Node<Integer> l2 = new Node<>(100);
     l2 = new Node<>(7, l2);
     l2 = new Node<>(1, l2);
     l2 = new Node<>(19, l2);
     l2 = new Node<>(11, l2);
     l2 = new Node<>(10, l2);

     l1= new Node<>(2, l1);
     l1= new Node<>(3, l1);
     l1= new Node<>(4, l1);


     printList(l1);
     System.out.println("\n");
     printList(l2);
     System.out.println("\n");
     printList(MakeNewList(l1,l2));
     System.out.println("\n");
     printList(l1);
     System.out.println("\n");
     printList(l2);
 }





    public static Node<Integer> MakeNewList (Node<Integer>l1, Node<Integer>l2){
        Node<Integer> l3=null;

        while(l1.hasNext()){
            int k =l1.getValue();
            if(k%2==0){
                int i = 1;
                Node<Integer> prev = null;
                Node<Integer> pos = l2;
                while(pos!=null){
                    if(i==k){
                        prev.setNext(pos.getNext());
                    }
                    prev=pos;
                    pos=pos.getNext();
                    i++;
                }

            }
            if(k%2!=0)
            {
                int i=1;
                Node<Integer> lst = l2;
                while(lst.getNext()!=null){

                    if(i==k){
                        l3= new Node<>(lst.getValue(), l3);
                        System.out.println(lst.getValue());
                    }
                    lst=lst.getNext();
                    i++;
                }

            }
            l1=l1.getNext();
        }
        return l3;
    }
    public static void printList(Node<Integer> lst)
    {
        Node<Integer> node = lst;
        while (node != null) {
            System.out.print(node.getValue() + "-> ");
            node = node.getNext();
        }
    }







}

