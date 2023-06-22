package com.apnacollege;
import java.util.*;
// FUNCTIONS AND METHOD
public class FunctionsAndMethods {
    //PrintMyName function
    public static void printMyName(String name){
        System.out.println("Hi " + name + " ! Nice to Meet you!");
        return;
    }

    //Addition Function
    public static int Sum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    //Multiplication Function
    public static int Product(int a, int b){
        int product=a*b;
        return product;
    }

    //Factorial Function
    public static int Factorial(int a){
        int fact=1;
        if(a<0){
            System.out.println("Invalid Number");
        }
        for(int i=1; i<=a; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("What's Your Name? ");
//        String name=sc.next();
//        printMyName(name);//Function Calling
//        System.out.print("Enter the First Number: ");
//        int a=sc.nextInt();
//        System.out.print("Enter the Second Number: ");
//        int b=sc.nextInt();
//        System.out.println("The Sum is " + Sum(a,b));
//        int product=Product(a,b);
//        System.out.println("Product of the two numbers is: " + product);

        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("The Factorial of " + a + " is " + Factorial(a));
    }
}
