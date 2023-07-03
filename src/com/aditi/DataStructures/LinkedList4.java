package com.aditi.DataStructures;

public class LinkedList4 {
    Node head;
    private int size;

    LinkedList4(){
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

    //FINDING AND DELETING THE nth NODE FROM LAST OF THE LINKED LIST (Given, n is always valid)
    public Node removeNodeFromnthPosition(Node head, int n){
        if(head.next==null){ //if the list consist of a single element
            return null;
        }
        //Determining the size of the list
        Node currentNode=head;
        int size=0;
        while(currentNode!=null){
            currentNode=currentNode.next;
            size++;
        }

        //Finding the node of nth from last
        //If distance of a node from last is n then distance of that node from first = size-n+1
        //So the previous node of the required node lies in (size-n)th position
        if(n==size){
            return head.next;
            //If we are asked to delete the head, i.e. nth element from last;
            // then we have to return the second last element instead of last element
        }
        int indexToSearch=size-n;
        Node previousNode=head;
        int i=1; //0th index is taken an 1
        while(i<indexToSearch){
            previousNode=previousNode.next;
            i++;
        }
        previousNode.next=previousNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedList4 list=new LinkedList4();
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("6");
        list.addFirst("4");
        list.addFirst("5");
        list.addFirst("7");
        list.addFirst("8");
        list.addFirst("9");
        list.printList();
        list.removeNodeFromnthPosition(list.head, 4);
        list.printList();

    }
}
