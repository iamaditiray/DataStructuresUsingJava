package com.aditi.newPackage;

public class accessModifiers {
    public String name; //Setting the elements to public so that it can be accessed in other packages.
    public int RollNumber;
    public void printInformation(){
        System.out.println("My name is " + name + ". My Roll number is " + RollNumber);
    }
}
