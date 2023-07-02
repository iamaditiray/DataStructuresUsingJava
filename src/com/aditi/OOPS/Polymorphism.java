package com.aditi.OOPS;
//POLYMORPHISM --> Different forms.
//Two Types of Polymorphism
    /* 1. Compile Time Polymorphism (Method Overloading)
    *  2. Runtime Polymorphism (Method Overriding) */

class Classroom{

    String [] names;
    int noOfTeachers;
    int noOfStudents;

    //Compile Time Polymorphism --> Method Overloading

    Classroom(int noOfTeachers, int noOfStudents, String [] names){
        this.noOfStudents=noOfStudents;
        this.noOfTeachers=noOfTeachers;
        this.names=names;

        System.out.println("There are " + noOfStudents + " students"
                           + " and " + noOfTeachers + " teachers ");
        System.out.println("They are : ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    Classroom(String [] names, int noOfTeachers, int noOfStudents){
        System.out.println("This is Overloaded Class with different sequence of arguments");
    }

    Classroom(int noOfTeacher){
        System.out.println("This is overloaded class with different number of arguments.");
    }

    Classroom(String [] names){
        System.out.println("This is overloaded class with different type of arguments.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        String [] names={"Aditi Ray", "Soulina Chanda", "Tanisha Singha Roy"};
        Classroom C1=new Classroom(23, 45, names);
        Classroom C2=new Classroom(names, 50, 60);
        Classroom C3=new Classroom(60);
        Classroom C4=new Classroom(names);
    }
}
