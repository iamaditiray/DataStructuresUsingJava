package com.aditi.DataStructures;

public class LinkedList6 {
    Node head;
    private int size;

    LinkedList6(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public boolean FindLoop(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList6 list=new LinkedList6();
        list.addFirst("1");
        list.addFirst("1");
        list.addFirst("1");
        list.addFirst("1");
        list.addFirst("1");
        list.addFirst("1");
        list.addFirst("1");
        if(list.FindLoop(list.head)){
            System.out.println("There's a Loop in the list.");
        }else{
            System.out.println("There's no loop in the list.");
        }
    }
}
