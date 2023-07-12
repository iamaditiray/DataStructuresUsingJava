package com.aditi.PracticeQuestions;

public class CountDigit {
    public static void main(String[] args) {
        long number=3333444455555555222L;
        int count=0;
        while(number>1){
            if(number%10==3){
                count++;
            }number/=10;
        }
        System.out.println(count);
    }
}
