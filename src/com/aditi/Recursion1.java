package com.aditi;

public class Recursion1 {
    //Print Numbers 5-1 using Recursion
    public static void printNumber1(int n){
        if(n==0) return; //Base Case
        System.out.println(n + " "); //Operation (Outer function performs the operation one time and assumes that inner function will do the rest)
        printNumber1(n-1); //Recursion
    }

    //Print Numbers 1-5 using Recursion
    public static void printNumber2(int n){
        if(n==6){
            return;
        }
        System.out.println(n + " ");
        printNumber2(n+1);
    }

    //Print sum of n Natural Numbers
    public static void printSum(int i, int n, int sum){

        if(i==n){
            sum+=i;
            System.out.println("The Sum is: " + sum);
            return;
        }
        sum = sum + i;
        printSum(i+1, n, sum);
    }

    //Print Factorial of a Number

    //Method 1
    public static void printFactorial(int i, int n, int fact){

        if(i==n){
            fact = fact*i;
            System.out.println("The Factorial of " + n + " is: " + fact);
            return;
        }
        fact *= i;
        printFactorial(i+1, n, fact);
    }

    //Method 2
    //Factorial if n = n*(n-1)*(n-2)*(n-3)*(n-4)*...3*2*1

    public static int calculateFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact = n * calculateFactorial(n-1);
        return fact;
    }

    //Print the Fibonacci Series till nth term

    public static void printFibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b; // a=1st term, b=2nd term, n=number of terms
        System.out.print(c+ " ");
        printFibonacci(b,c,n-1); //Number of terms decreased by 1 so n=n-1
    }

    //Print x^n using Recursion (Stack Height = n)

    public static int calculatePower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int xPowern= x * calculatePower(x, n-1); // x^n=x*x^(n-1)
        return xPowern;
    }

    //Print x^n using Recursion (Stack Height = Log n)
        //    for n=even
        //    x^n=x^(n/2)*x^(n/2)
        //    for n=odd
        //    x^n=x^(n/2)*x^(n/2)*x

    public static int calculatePower2(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(n%2==0){
            int xPowern=calculatePower2(x, n/2)*calculatePower2(x,n/2);
            return xPowern;
        }
        else{
            int xPowern=calculatePower2(x, n/2)*calculatePower2(x, n/2)*x;
            return xPowern;
        }
    }
    public static void main(String[] args) {

//        printNumber1(5);

//        printNumber2(1);

//        printSum(1, 5, 0);

//        printFactorial(1, 5, 1);

//        int n=5;
//        int factorial=calculateFactorial(n);
//        System.out.println("The Factorial of " + n + " is: " + factorial);


//        int a=0;
//        int b=1;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        int n=8;
//        printFibonacci(a, b, n-2); //Already two terms 0 and 1 are printed so number of terms is n-2

//        int x=2;
//        int n=5;
//        System.out.println("The value of " + x + "^" + n + " is: " + calculatePower(x,n));

        int x=2;
        int n1=5;//odd
        int n2=4;//even
        System.out.println("The value of " + x + "^" + n1 + " is: " + calculatePower2(x,n1)); //32
        System.out.println("The value of " + x + "^" + n2 + " is: " + calculatePower2(x,n2)); //16

    }
}
