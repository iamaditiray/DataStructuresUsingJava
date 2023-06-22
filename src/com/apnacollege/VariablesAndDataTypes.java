package com.apnacollege;
import java.util.*;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        //output
        System.out.println("Hello World!");
        System.out.print("Hello World with Java\n");
        System.out.print("Hello World with Java\n");
        System.out.print("*\n**\n**\n***\n****\n");
//
//        //Variable
        String name="Aditi Ray";
        int a=10;
        int b=20;
        double price=25.25;
//
//      //DataTypes
        int c=10;
        int d=5;
        int sum=c+d;
        int mul=c*d;
        System.out.println("The sum is "+ sum);
        System.out.println("The product is "+ mul);

        int ans = (c*d)/(c-d);
        int ans2 = c*d/c-d;
        System.out.println(ans);
        System.out.println(ans2);

//      //Input
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int num=sc.nextInt();
        float dec=sc.nextFloat();
        System.out.println(sentence + "\n" + num + "\n" + dec);

        //Quick Quiz
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the First Number: " );
        int a1=scan.nextInt();
        System.out.print("Enter the Second Number: ");
        int b1=scan.nextInt();
        System.out.println("The Sum is " + (a1+b1));
    }
}
