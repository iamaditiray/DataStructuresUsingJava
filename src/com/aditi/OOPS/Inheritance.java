package com.aditi.OOPS;
//Inheritance : Process of inheriting all the properties and behaviours of parent object to a child object

    //Single Level Inheritance : Only one child class is derived by parent class
    class Shape{
        int length;
        int breadth;
        void printInfo(){
            if(length==breadth){
                System.out.println("This is a Square");
            }else{
                System.out.println("This is a rectangle");
            }
        }
    }
    class Square extends Shape{
        void area(int length, int breadth){
            System.out.println("The area of the Square is " + length*breadth);
        }
    }

    //Multilevel Inheritance: Child class derived from a parent class becomes a parent class itself and derives another child class
    class Electronics{
        String type;
        int modelNo;
        public void printInfo1(){
            System.out.println("This is a " + type + " of Model number " + modelNo);
        }
    }

    class Phone extends Electronics{
        String brand;
        public void printInfo2(){
            System.out.println("This Phone is of Brand " + brand);
        }
    }

    class Smartphone extends Phone{
        public void printInfo3(){
            System.out.println("This smartphone has brand new features.");
        }
    }

    //Hierarchical Inheritance: Multiple child classes are derived from one parent class
    class Pet{
        String name;
        public void pet(){
            System.out.println("This is " + name);
        }
    }

    class Cat extends Pet{
        public void Mew(){
            System.out.println("The cat is mewing");
        }
    }

    class Dog extends Pet{
        public void Bark(){
            System.out.println("The dog is barking");
        }
    }

    //Hybrid Inheritance : Combination any of the above two
    //Multiple Inheritance : Properties and behaviours of two parent classes are inherited into one parent class.
public class Inheritance {
    public static void main(String[] args) {

//        Square s1=new Square();
//        s1.length=20;
//        s1.breadth=20;
//        s1.printInfo();
//        s1.area(s1.length, s1.breadth);

//        Smartphone s1=new Smartphone();
//        s1.type="Phone";
//        s1.brand="Samsung";
//        s1.modelNo=876568;
//        s1.printInfo1();
//        s1.printInfo2();
//        s1.printInfo3();

        Cat c1=new Cat();
        c1.name="Marcel";
        c1.pet();
        c1.Mew();

        Dog d1=new Dog();
        d1.name="Gunther";
        d1.pet();
        d1.Bark();
    }
}
