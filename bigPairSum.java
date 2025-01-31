package com.company;

import java.util.Stack;

public class bigPairSum {
    public static void main (String[]args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(7);
        st1.push(6);
        st1.push(14);
        st1.push(8);
        st1.push(12);
        st1.push(9);
        st1.push(7);
        st2.push(11);
        st2.push(9);
        st2.push(1);
        st2.push(4);
        st2.push(13);
        st2.push(4);
        st2.push(8);
        st2.push(2);
        System.out.println(FindBigSum(st1,st2));


    }
    public static int FindBigSum(Stack<Integer> st1, Stack<Integer> st2){
        Stack<Integer> tan1 = new Stack<>();
        Stack<Integer> tan2 = new Stack<>();
        int max=0;
        int x1= st1.pop();
        int x2= st2.pop();
        tan1.push(x1);
        tan2.push(x2);
        while (!st1.empty() && !st2.empty()){
            if((x1+st1.peek())>(x2+st2.peek())){
                max= x1+st1.peek();
                x2=st2.pop();
                tan2.push(x2);
            }
            else
            if((x1+st1.peek())< (x2+st2.peek())){
                max = x2+st2.peek();
                x1=st1.pop();
                tan1.push(x1);
            }
            else
                if ((x1+st1.peek())==(x2+st2.peek())){
                    x1=st1.pop();
                    tan1.push(x1);
                    x2=st2.pop();
                    tan2.push(x2);
                }
        }
        while(!tan1.empty())st1.push(tan1.pop());
        while(!tan2.empty())st2.push(tan2.pop());
        return max;
    }
}
