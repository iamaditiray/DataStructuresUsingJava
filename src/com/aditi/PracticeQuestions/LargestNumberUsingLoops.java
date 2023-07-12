package com.aditi.PracticeQuestions;
import java.util.Scanner;

public class LargestNumberUsingLoops {
    public static int maxNum(int a, int b, int c){
/*
        int max=0;
           if(a>b){
              max=a;
              }else{
              max=b;
              }
          if(c>max){
              max=c;
              }
              return c;
*/
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The Maximum Number is : " + maxNum(a,b,c));
    }
}
