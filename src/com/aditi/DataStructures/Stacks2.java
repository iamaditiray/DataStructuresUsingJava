package com.aditi.DataStructures;
import java.util.ArrayList;
import java.util.Stack;

public class Stacks2 {
    static class Stack{
        ArrayList <Integer> list = new ArrayList<>();
        //ISEMPTY OPERATION
        public boolean isEmpty(){
            return list.size()==0;
        }
        //PUSH OPERATION
        public void push(int data){
            list.add(data);
        }
        //POP OPERATION
        public int pop(){
            if(list.size()==0){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //PEEK OPERATION
        public int peek(){
            if(list.size()==0){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
