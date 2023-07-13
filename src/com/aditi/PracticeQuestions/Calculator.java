package com.aditi.PracticeQuestions;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");

        while (true) {
            System.out.print("Enter the Operator (Select From +,-,*,/,%, ^) : ");
            char operation = scan.next().trim().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%' || operation == '^') {
                System.out.println("Enter Two Numbers");
                int a = scan.nextInt();
                int b = scan.nextInt();
                if (operation == '+') {
                    System.out.println(a + b);
                } else if (operation == '-') {
                    System.out.println(a - b);
                } else if (operation == '*') {
                    System.out.println(a * b);
                } else if (operation == '/') {
                    if (b > 0) System.out.println(a / b);
                    else System.out.println("Math Error!");
                } else if (operation == '%') {
                    System.out.println(a % b);
                } else {
                    int result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                    System.out.println(result);
                }
            } else if (operation == 'x' || operation == 'X') {
                System.out.println("Calculator Terminated");
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
