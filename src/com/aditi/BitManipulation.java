package com.aditi;
import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {


        //GetBit

        int number=5; //0101
        int position=2;

        int BitMask=1<<position;

        if((BitMask & number)==0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");
        }

        //SetBit

        int position2=1;
        int BitMask2=1<<position2;

        int newNumber= (BitMask2|number);
        System.out.println("New Number is: " + newNumber);


        //ClearBit

        int position3=2;
        int BitMask3=1<<position3;

        int newNumber2= (~BitMask3) & number;
        System.out.println("New Number is: " + newNumber2);

        //Update Bit

        Scanner sc=new Scanner(System.in);
        System.out.println("Which Operation do you Want to Perform? (Select 1 OR 0) : ");
        int Operation=sc.nextInt();
        int number2=5;
        int position4=1;
        int BitMask4=1<<position4;

        if(Operation==1){
            //SET Operation
            int NewNum=BitMask4|number2;
            System.out.println(NewNum);
        } else if (Operation==0) {
            //CLEAR Operation
            int notBitMask=(~BitMask4);
            int NewNum2=notBitMask&number2;
            System.out.println(NewNum2);
        }
    }
}
