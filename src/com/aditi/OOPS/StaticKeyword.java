package com.aditi.OOPS;
class Students{
    static String name;
    int RollNumber;
}
public class StaticKeyword {
    public static void main(String[] args) {
        Students.name="Aditi Ray"; //Static Variable can be directly accessed without creating objects
        Students s1=new Students();
        s1.RollNumber=20;
        System.out.println(s1.RollNumber);
        System.out.println(s1.name);
    }
}
