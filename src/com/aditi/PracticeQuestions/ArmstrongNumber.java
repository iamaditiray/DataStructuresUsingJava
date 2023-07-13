package com.aditi.PracticeQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("The Armstrong numbers from 100 to 1000 are : ");
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isArmstrong(int a){
        int original=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            a/=10;
            sum+=(rem*rem*rem);
        }
        return sum==original;
    }
}
//ARMSTRONG NUMBER:
//if for abc
//a^3+b^3+c^3=abc
//then abc is an Armstrong Number
