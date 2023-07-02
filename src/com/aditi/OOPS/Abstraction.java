package com.aditi.OOPS;
//Abstraction: Method of hiding internal implementation of data which is unnecessary for users. A method with no body.
//Abstraction is achieved by
//                            1.Abstract class
//                            2. Interface(Pure Abstraction)


//Using ABSTRACT CLASS
abstract class Animal{
    abstract void walk(); //Abstract method with no body
    public void eat(){
        System.out.println("Animal is eating"); //Abstract class can also have non-Abstract methods
    }
    Animal(){ //Abstract classes can have constructors
        System.out.println("This is an Animal");
    }
}

class Kitten extends Animal{
    public void walk(){
        System.out.println("This is a cat. It is walking"); //Abstract method of abstract class must be implemented in inherited class.
    }
    Kitten(){
        System.out.println("The animal is Kitten");
    }
}


//Using INTERFACE
interface Fruit{
    void Taste();
    void Color();
    //All methods must be abstract in an interface
//    Fruit(){
//        !ERROR (Constructors cannot be initiated in interface
//    }
}
 class Mango implements Fruit{ //Child class implemented from interface
    public void Taste(){ //Methods are public static and final by default. All methods must be implemented.
        System.out.println("Mango tastes good");
    }
     public void Color() {
         System.out.println("Mango is Yellow");
     }
 }
public class Abstraction {
    public static void main(String[] args) {
//        Kitten k1=new Kitten();
//        k1.walk();
//        k1.eat();

//        Animal a1=new Animal(); //Animal is abstract class, and it cannot be instantiated. (ERROR)

         Mango m1=new Mango();
         m1.Color();
         m1.Taste();
    }
}
