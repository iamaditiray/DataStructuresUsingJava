package com.aditi.DataStructures;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>listOfNumbers=new ArrayList<Integer>();

        //Adding Elements to ArrayList
        listOfNumbers.add(6);
        listOfNumbers.add(5);
        listOfNumbers.add(4);
        listOfNumbers.add(7);
        listOfNumbers.add(2);
        listOfNumbers.add(8);
        listOfNumbers.add(9);
        System.out.println(listOfNumbers);

        //Get an element of a given index
        int element=listOfNumbers.get(5);
        System.out.println("Element is the 5th Index is "+ element);

        //Set (Change) an element of a given index
        listOfNumbers.set(0,1);
        System.out.println(listOfNumbers);

        //Delete an element of a given index
        listOfNumbers.remove(5);
        System.out.println(listOfNumbers);

        //Determine size of an Arraylist
        System.out.println(listOfNumbers.size());

        //Using Loops
        for (int i=0; i<listOfNumbers.size(); i++){
            System.out.println(listOfNumbers.get(i));
        }

        //Sorting Elements of an arraylist
        listOfNumbers.add(1,3);
        listOfNumbers.add(2,6);
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);

    }
}
