package com.aditi;
import java.util.*;
//Best Pattern Questions(Beginner Level)
public class Patterns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking Input of Number of Rows and Columns

        System.out.print("Enter Number of Rows:");
        int x=sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int y=sc.nextInt();

        //SOLID Rectangle Pattern

        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //HOLLOW Rectangle pattern

        for (int i=1; i<=x;i++){
            for(int j=1; j<=y; j++){
                if( i==1 || i==x || j==1 || j==y ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // HALF PYRAMID Pattern

        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Inverted Half Pyramid

        for(int i=x; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Inverted Half Pyramid (Rotated by 180 deg)

        for (int i=1; i<=x; i++){
            //SPACES
            for(int j=1; j<=(x-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }System.out.println(" ");
        }

        //Half Pyramid using Numbers

        for (int i=1; i<=x; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " " );
            }
            System.out.println("  ");
        }

        //INVERTED HALF PYRAMID WITH NUMBERS

        for(int i=x; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        //FLOYD'S TRIANGLE

        int number=1;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }

        //0-1 TRIANGLE

        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println(" ");
        }

    }
}
