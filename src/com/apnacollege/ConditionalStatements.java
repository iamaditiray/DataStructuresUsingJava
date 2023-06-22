package com.apnacollege;
import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {

        //CONDITIONAL STATEMENT - if-else
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not an Adult");
        }

        //Check even-odd
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        //Switch-Break
        System.out.println("Press a Button");
         int button=sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
