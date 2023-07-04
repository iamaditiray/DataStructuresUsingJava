package com.aditi.DataStructures;

import java.util.Stack;

public class Stacks4 {
    //PUSHING AN ELEMENT AT THE BOTTOM OF STACK (USING RECURSION)
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.size()==0){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<Integer>();
        s1.push(11);
        s1.push(12);
        s1.push(13);
        pushAtBottom(10,s1);
        printStack(s1);
    }
}
