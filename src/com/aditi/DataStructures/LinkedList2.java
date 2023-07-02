package com.aditi.DataStructures;
import java.util.*;
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList <Integer> list=new LinkedList<>();

        //.add(e) -> Adding Element at last by default
        //.addFirst(e) -> Adding element at First
        //.addLast(e) -> Adding element at Last
        //.add(e,i) -> Adding element e at particular index i
        //.removeFirst -> Deleting First element
        //.removeLast -> Deleting last element
        //.remove(i) -> Deleting element from particular index i
        //.size() -> Determines the Size
        //.get(i) ->Determines the element present in index i

        list.add(7);
        list.addFirst(5);
        list.addFirst(1);
        list.addLast(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4, 10);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.addFirst(1);
        list.addLast(3);
        System.out.println(list);
        System.out.println("The size of the list is " + list.size());
        System.out.println("Element at the 3rd index is " + list.get(2));
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("NULL");
        System.out.println();

        //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
        //Solution of Question
        int value =7;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==value){
                System.out.println("Found the element " + value + " at index " + i);
            }
        }
    }
}
