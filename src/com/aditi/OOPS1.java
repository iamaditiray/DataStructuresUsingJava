package com.aditi;

class Student{ //CLASS: Logical representation of data.
    String name;
    int year;
    //Constructors are special type of methods invoked automatically during the time of object creation.
    Student(){//Non-Parameterized Constructor
        System.out.println("This is a Non-Parameterized Constructor");
    }
    public void printInfo(){ //Method: Function defined inside class.
        System.out.println("The name of the student is" + this.name); //Usage of this keyword to refer to the current object
        System.out.println("The Student is in " + this.year + "year");
    }
}

class Peer{
    String name;
    int rollNumber;

    Peer(String name, int rollNumber){//Parameterized Constructor
        this.name /*This is the predefined property of the Class*/=name; /*This is the value assigned to the constructor parameter*/
        this.rollNumber/*This is the predefined property of the Class*/=rollNumber;/*This is the value assigned to the constructor parameter*/
        System.out.println("Roll Number of " + name + " is " + rollNumber);
    }
}

class Members{
    String name;
    int rollNumber;
    Members(Members m1){ //Copy Constructor. Copies the properties and methods of Members() Constructor
        this.name=m1.name;
        this.rollNumber= m1.rollNumber;
    }

    Members(){
        //Since one constructor is defined, Members() constructor must be defined separately as this time Constructors
        //won't be declared by default.
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(rollNumber);
    }

}

public class OOPS1 {
    public static void main(String[] args) {
        Student S1=new Student(); //Initialisation of object and invoking constructor
        //Assigning properties to Object
        S1.name="Aditi Ray";
        S1.year=1;
        S1.printInfo(); //Function calling of object
//          //Output
//              This is a Non-Parameterized Constructor (Constructor is called first. If not user defined, called by default in java.)
//              The name of the student isAditi Ray
//              The Student is in 1year

        Peer p1=new Peer("Aditi Ray", 1);
//          //Output
//              Roll Number of Aditi Ray is 1

        Members m1=new Members();
        m1.name="Aditi Ray";
        m1.rollNumber=4;

        Members m2=new Members(m1); //Passing properties of object of one constructor to another.
        m2.printInfo();
//          //Output
//              Aditi Ray
//              4
    }
}
