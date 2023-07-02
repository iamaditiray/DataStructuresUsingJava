package com.aditi;
import com.aditi.newPackage.*; //Importing a Package

class defaultModifiers{
    String name; //Default modifier : Accessible only within package.
    protected int EnrollmentNumber; //Protected Modifier : Within package and outside package using child class.
    private int RegistrationNumber; //Private Modifier : Accessible only within class

    //Private Modifiers are accessed outside class using getters and setters
    public int getRegistrationNumber(){
        return this.RegistrationNumber;
    }

    public void setRegistrationNumber(int RegistrationNumber){
        this.RegistrationNumber=RegistrationNumber;
    }
}
public class PackagesAndAccessModifiers {
    public static void main(String[] args) {

            helloWorld greet=new helloWorld();
            greet.printGreetings();

            accessModifiers a1=new accessModifiers(); //Use of public access modifiers
            a1.name="Aditi Ray";
            a1.RollNumber=90;
            a1.printInformation();

            defaultModifiers dm1=new defaultModifiers();
            dm1.name="Aditi Ray"; //Default Modifiers can only be accessed within same package.
            dm1.EnrollmentNumber=1202000; //Protected
//          dm1.RegistrationNumber=100; //Protected modifiers cannot be accessed outside class.
            //Usage of getters and setters to access private modifiers
            dm1.setRegistrationNumber(30420);
            System.out.println(dm1.getRegistrationNumber());

    }
}
