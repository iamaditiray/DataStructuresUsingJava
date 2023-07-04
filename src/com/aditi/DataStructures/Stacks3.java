package com.aditi.DataStructures;
import java.util.Stack;

public class Stacks3 {
    public static void main(String[] args) {


    Stack<Integer> s1=new Stack<Integer>();
    s1.push(10);
    s1.push(12);
    s1.push(14);
    s1.push(16);
    s1.push(18);

    while(!s1.isEmpty()){
        System.out.println(s1.peek());
        s1.pop();
    }

    }
}
