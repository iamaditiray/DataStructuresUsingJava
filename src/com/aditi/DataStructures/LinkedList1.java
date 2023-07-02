package com.aditi.DataStructures;
//Scratch Implementation
public class LinkedList1 {

    Node head;
    private int size; //For tracking the size of the LinkedList

    LinkedList1(){
        size=0;//Primarily the size of the Linked-list is 0
    }

    class Node{
        //A class used to define head, data and nodes to the linked-list
        String data;
        Node next;

        Node(String data){ //Insertion od data in a linkedList
            this.data=data;
            this.next=null; //Initially next node is considered as null
            size++;//Whenever Creating new Node increment of size
        }
    }

    //ADDING AN ELEMENT AT THE FIRST POSITION OF THE LINKED-LIST
    public void addAtFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head; //Previously head is now the next node of the new node since new node is added at first
        head=newNode; //Head is now the new node that is added
    }

    //ADDING AN ELEMENT AT THE LAST POSITION OF THE LINKED LIST
    public void addAtLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode=head; //Starting current node from head
        while(currentNode.next!=null){
            currentNode=currentNode.next; //Till next node of current node becomes 0 we will keep assigning next node of current node as new current node
        }

        //After current node reaches last position where next of current node is 0
        currentNode.next=newNode;
    }

    //PRINTING THE LINKED LIST
    public void printList(){
        if(head==null){
            System.out.println("List is Empty.");
        }
        Node currentNode=head;
        while (currentNode != null) {
            System.out.print(currentNode.data+ "-> ");
            currentNode=currentNode.next;
        }
        System.out.print("NULL");
    }

    //DELETING AN ELEMENT FROM THE LAST
    public void deleteFromFirst(){
        if(head==null){
            System.out.println("List is empty. Nothing to Delete");
        }
        size--; //Whenever deleting a node decrement of size
        head=head.next;//Just declaring the second element as Head
    }

    //DELETING AN ELEMENT FROM THE LAST
    public void deleteFromLast(){
        if(head==null){
            System.out.println("List is Empty");
        }
        size--;//Before the next Corner condition to ensure that if the list is of one element then also size is traced.
        if(head.next==null){ //This means there is only one element in the list. We have to delete that
            head=null;
        }

        Node secondLast=head; //Starting from head considering it as second last element
        Node lastNode=head.next; //Taking the 2nd as last element

        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }

        secondLast.next=null;
    }

    //DETERMINING THE SIZE OF THE LIST
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
        list.addAtFirst("List");
        list.addAtFirst("a ");
        list.addAtFirst("is ");
        list.addAtFirst(" This ");
        list.printList();
        System.out.println();
        list.addAtLast("Adding ");
        list.addAtLast("an ");
        list.addAtLast("Element ");
        list.addAtLast("to ");
        list.addAtLast("the ");
        list.addAtLast("last ");
        list.printList();
        System.out.println();
        list.deleteFromFirst();
        list.printList();
        System.out.println();
        list.deleteFromLast();
        list.printList();
        System.out.println();
        System.out.println("The Size of the List is " + list.getSize());
        list.deleteFromLast();
        list.deleteFromFirst();
        list.printList();
        System.out.println();
        System.out.println("Now size is " + list.getSize());
    }
}

/*  OUTPUT :-
This -> is -> a -> List-> NULL
This -> is -> a -> List-> Adding -> an -> Element -> to -> the -> last -> NULL
is -> a -> List-> Adding -> an -> Element -> to -> the -> last -> NULL
is -> a -> List-> Adding -> an -> Element -> to -> the -> NULL
The Size of the List is 8
a -> List-> Adding -> an -> Element -> to -> NULL
Now size is 6
* */
