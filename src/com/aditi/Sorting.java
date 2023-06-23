package com.aditi;
import java.util.Scanner;

public class Sorting {

    public static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter Element " + i + ": ");
            arr[i]=sc.nextInt();
        }

        System.out.print("The Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //BUBBLE SORT
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(" ");
//        System.out.print("The Sorted array is: " );
//        printArray(arr);

        //SELECTION SORT
//        for(int i=0; i<arr.length-1; i++){
//            int smallest=i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        System.out.println();
//        System.out.print("The sorted array is: ");
//        printArray(arr);

        //INSERTION SORT
        //First Element is in the sorted part already. Considering from the Second Element. So, Starting from i=1
        for(int i=1; i<arr.length; i++){
            //Taking 2nd element as current element
            int current=arr[i];
            int j=i-1;//Considering previous of the current element to compare
            //J should always be >0 and current element is compared if it is smaller than the previous element
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];//right shift of the greater element
                j--; // i=1, j=0; i=2, j=1; i=3, j=2...
            }
            //Placing smaller element in the left
            arr[j+1]=current;
        }
        System.out.println();
        System.out.print("The Sorted Array is: ");
        printArray(arr);
    }
}
