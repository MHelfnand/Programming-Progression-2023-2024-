package com.company;

public class SumOfStack_Compare {
    public static void main (String[]args) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> stt = new Stack<>();


        st.push(6);
        st.push(14);
        st.push(8);
        st.push(12);
        st.push(9);
        st.push(7);
        stt.push(11);
        stt.push(9);
        stt.push(1);
        stt.push(4);
        stt.push(13);
        stt.push(4);
        stt.push(8);
        stt.push(2);

        System.out.println(topSum(st,stt));


    }

    public static int topSum(Stack<Integer> s1, Stack<Integer> s2){
        int x = s1.pop();
        int y= s1.pop();
        int sum =findMaxTwo(s2);
        while(!s1.isEmpty()&&((x+y)< sum)){
            x=y;
            y=s1.pop();
        }
        if(s1.isEmpty())
            return 0;
        return x+y;
    }

    public static int findMaxTwo(Stack<Integer> s1){
        int x = s1.pop();
        int y= s1.pop();
        int sum =x+y;
        while(!s1.isEmpty()){
            x=y;
            y=s1.pop();
            if(x+y>sum)
                sum=x+y;
        }
        return sum;
    }


















}
