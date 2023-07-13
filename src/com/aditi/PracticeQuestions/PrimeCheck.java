package com.aditi.PracticeQuestions;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Number to Check is it is Prime or Not: ");
        System.out.println(isPrime(scan.nextInt()));
    }
    static boolean isPrime(int a){
        if(a<1){
            return false;
        }else if(a==1){
            System.out.println("1 is neither prime nor composite.");
            return false;
        }else {
            for(int i=2; i<a; i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
