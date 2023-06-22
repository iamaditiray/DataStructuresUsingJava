package com.aditi;
import java.util.*;
//ADVANCED PATTERN QUESTIONS
public class Patterns2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int x=sc.nextInt();

        //Butterfly Pattern

//        for(int i=1; i<=x; i++){
//            //1st Part Stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            //Spaces
//            for(int j=1; j<=(2*(x-i)); j++){
//                System.out.print("  ");
//            }
//            //3rd Part Stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//        for(int i=x; i>=1; i--){
//            //1st Part Stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            //Spaces
//            for(int j=1; j<=(2*(x-i)); j++){
//                System.out.print("  ");
//            }
//            //3rd Part Stars
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Solid Rhombus

//        for(int i=1; i<=x; i++){
//            for (int j=1; j<=(x-i); j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=x; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Number Pyramid

//        for(int i=1; i<=x; i++){
//            for(int j=1; j<=(x-i); j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print( i + " ");
//            }
//            System.out.println(" ");
//        }

        //PALINDROMIC PATTERN

//        for(int i=1; i<=x; i++){
//            for(int j=1; j<=(x-i); j++){
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--){
//                System.out.print( j );
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print(  j );
//            }
//            System.out.println(" ");
//        }

        //DIAMOND PATTERN

        for(int i=1; i<=x; i++){
            for(int j=1; j<=(x-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((i-1)+i); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=x; i>=1; i--){
            for(int j=1; j<=(x-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((i-1)+i); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
