package com.aditi.PracticeQuestions;

public class ReverseNum {
    public static void main(String[] args) {
       int num=987654321;
       int reverseNum=0;
       while(num>0){
           int rem=num%10;
           num/=10;
           reverseNum=reverseNum*10+rem;
       }
        System.out.println(reverseNum);
    }
}
