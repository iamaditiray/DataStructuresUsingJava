package com.aditi.DataStructures;

public class LinkedList3 {
    Node head;
    private int size;
    LinkedList3(){
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
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is Empty.");
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    //REVERSING THE LINKED-LIST IN ITERATIVE WAY
    public void reverseIterate(){
        if(head==null /*List is Empty*/ || head.next==null /*list has only one element*/){
            return;//List is already reversed.
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            //Changing prevNode to current.next
            currentNode.next=prevNode;
            //Updating Nodes
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null; //Since first element becomes the last element.
        head=prevNode;
    }

    //REVERSING AN ARRAY IN RECURSIVE METHOD
    public static Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.addFirst("6");
        list.addFirst("7");
        list.addFirst("2");
        list.addFirst("5");
        list.addFirst("8");
        list.addFirst("9");

        list.printList();
        list.reverseIterate();
        list.printList();

        list.head=reverseRecursive(list.head);
        list.printList();
    }
}
