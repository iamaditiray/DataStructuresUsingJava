package com.aditi.PracticeQuestions;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int limit=sc.nextInt();

        int a=0;
        int b=1;

//        //Using For Loop
//        System.out.println(a);
//        System.out.println(b);
//        for(int i=2; i<limit; i++){
//            int temp=b;
//            b=a+b;
//            a=temp;
//            System.out.println(b);

        //Using While Loop
        int count=2;
        System.out.println(a);
        System.out.println(b);
        while(count<limit){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);
            count++;
        }
    }
}
