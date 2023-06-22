package com.aditi;
import java.util.Scanner;
//LOOPS
public class Loops {
    public static void main(String[] args) {

        //FOR-LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        for (int counter = 0; counter <= 100; counter = counter + 1) {
            System.out.print(counter + "  ");
        }
//
//        //WHILE-LOOP
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
//
//        //DO-WHILE LOOP
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 5);

        //Quick Quiz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " X " + j + " = " + (n * j));
        }
            int i1 = 1;
            do {
                System.out.println(n + " X " + i1 + " = " + (n * i1));
                i1++;
            } while (i1 <= 10);
            while (i1 <= 10) {
                System.out.println(n + " X " + i1 + " = " + (n * i1));
                i1++;
            }
            int sum1 = 0;
            for (int k = 1; k <= n; k++) {
                sum1 = sum1 + k;
            }
            System.out.println(sum1);
        }
    }

