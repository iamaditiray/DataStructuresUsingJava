package com.apnacollege;
import java.util.*;
//ARRAYS INTRODUCTION
public class IntroductionToArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        //Array Input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Element" + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
//        //Array Output
//        System.out.println("Your Marks are: ");
//        for(int i=0; i<=size;i++){
//            System.out.println(marks[i]);
//        }

        //Finding an Element
        System.out.println("Which Element do you want to find? ");
        int element = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == element) {
                System.out.println("Element found in index " + i);
                break;
            } else{
                System.out.println("Element not found.");
            }

        }
    }
}

