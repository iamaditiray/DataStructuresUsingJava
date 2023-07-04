package com.aditi.DataStructures;
import java.util.Stack;

public class Stacks5 {
    public static void pushAtBottom(int data, Stack<Integer> s1){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top=s1.pop();
        pushAtBottom(data, s1);
        s1.push(top);
    }
    //REVERSING A STACK USING PUSH-BOTTOM OPERATION
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }


    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<Integer>();
        s1.push(11);
        s1.push(12);
        s1.push(13);
        s1.push(14);
        s1.push(15);

        reverseStack(s1);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
