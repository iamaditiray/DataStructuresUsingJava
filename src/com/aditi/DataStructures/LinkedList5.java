package com.aditi.DataStructures;

public class LinkedList5 {
    Node head;
    private int size;

    LinkedList5(){
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
    //Checking whether a LinkedList is Palindrome or not
    //We will be Following three steps -> 1.Find the Middle and Divide the list in two halves
    //                                    2.Reverse the second half
    //                                    3.Compare the two halves if they are equal or not
    public Node middleOfList(Node head){
        //Finding middle of a list using hare turtle method
        Node hare=head;
        Node turtle=head;
        while(hare.next != null && hare.next.next != null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public Node reverseList(Node head){
        Node prevNode=null; //Considering that the list is starting from null
        Node currentNode=head;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;

            prevNode=currentNode;
            currentNode=nextNode;
        }
        return prevNode;//PrevNode is the first node after reversing the list
    }
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true; //An empty list or single element list is always palindrome
        }
        //Finding the middle and assigning it as end node of first half.
        Node endOfFirstHalf=middleOfList(head);
        //Reversing the second half of the list
        Node startOfSecondHalf=reverseList(endOfFirstHalf.next); //Start of the reversed second half of the list
        Node startOfFirstHalf=head;
        //Comparing the First half with the reversed 2nd half
        while (startOfSecondHalf!=null){
            if(startOfFirstHalf.data!=startOfSecondHalf.data){
                return false;
            }
            startOfFirstHalf=startOfSecondHalf.next;
            startOfSecondHalf=startOfFirstHalf.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList5 list=new LinkedList5();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();
        if(list.isPalindrome(list.head)){
            System.out.println("List is Palindrome.");
        }else{
            System.out.println("List is not Palindrome.");
        }
    }
}
