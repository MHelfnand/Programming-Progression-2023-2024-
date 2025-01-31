package com.company;

public class lastAndremove {







    public static int lastRemove(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        int x=0;
        while(!s.isEmpty()) {
            x = s.pop();
            if(s.isEmpty()){
                while(!temp.isEmpty())
                    s.push(temp.pop());

            }
            temp.push(x);
        }
        return x;
    }
    public static Stack<TwoItems> StackTwoItems(Stack<Integer> s){
        Stack<TwoItems> s1 = new Stack<>();
        TwoItems N = new TwoItems();
        while(!s.isEmpty()){
            N.setValue1(s.pop());
            N.setValue2(lastRemove(s));
            s1.push(N);
        }
        return s1;
    }
}
