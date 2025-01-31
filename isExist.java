package com.company;

public class isExist {
    public static void main(String[]args)
    {
        Stack<Integer> st = new Stack<>();


        st.push(7);
        st.push(28);
        st.push(12334);
        st.push(565);
        st.push(251);
        st.push(122);

        if(!AllExist(st))
        System.out.println("yeah");


    }


    public static boolean Exist(Stack<Integer> stk,int num) {
        Stack<Integer> temp = new Stack<>();
        int x;


        while(!stk.isEmpty()) {
            x = stk.pop();
            temp.push(x);
            if(x%10==num)
            {
                while (!temp.isEmpty()) { stk.push(temp.pop());}
                return true;
            }
        }

        return false;
    }
    public static boolean AllExist(Stack<Integer> s){
        while(!s.isEmpty()){
            int x=s.pop();
            if(!Exist(s,LeftNum(x)))return false;
        }
        return true;
    }
    public static int LeftNum(int num){
        while(num<10){
            num=num/10;
        }
        return num;
    }




}
