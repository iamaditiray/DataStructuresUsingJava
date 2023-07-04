package com.aditi.DataStructures;

public class Stacks1 {

    //Implementation of Stack using LinkedList
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        // PUSH OPERATION TO ADD DATA AT THE TOP OF STACK
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // POP OPERATION TO DELETE THE ELEMENT PRESENT IN TOP OF STACK
        public static int pop() {
            if (head == null) {
                return -1; //-1 determines that the stack is empty
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // PEEK OPERATION TO FIND THE ELEMENT PRESENT IN TOP OF STACK
        public static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(11);
        s1.push(12);
        s1.push(13);
        s1.push(14);
        s1.push(15);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
