package com.aditi.PracticeQuestions;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch=scan.next().trim().charAt(0);
        //trim() deletes the white space
        // chatAt(index) returns the particular character present in that index
        if(ch>='a' && ch<='b'){
            System.out.println("This is a Lower Case Letter.");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("This is a Upper Case Letter.");
        }else{
            System.out.println("Invalid Input!");
        }
    }
}
