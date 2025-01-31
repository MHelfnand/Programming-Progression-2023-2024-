package com.company;


public class StackBagrut {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(15);
        stk.push(-4);
        stk.push(-4);
        stk.push(3);
        stk.push(5);
        stk.push(0);
        stk.push(0);
        stk.push(0);
        stk.push(5);
        stk.push(5);
        stk.push(15);
        stk.push(14);
        Stack<Integer> stk2 = nonBlock(stk);
        while(!stk2.isEmpty()){
            int num=stk.pop();
            System.out.println(num);
        }
    }
    public static Stack<Integer> nonBlock(Stack<Integer> stk) {
        Stack<Integer> stk2 = new Stack<>();
        while (!stk.isEmpty()) {
            int num = stk.pop();
            int num2=stk.top();
            if (num != num2)
                stk2.push(num);
            else
                num = stk.pop();
                num2= stk.top();
            while (num == num2){
                stk.pop();
                num2= stk.top();
            }
        }
        return stk2;
    }



}
