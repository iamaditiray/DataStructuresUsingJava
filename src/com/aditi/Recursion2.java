package com.aditi;
import java.util.*;
public class Recursion2 {

    //Tower of Hanoi
    public static void towerOfHanoi(int n, String Source, String Helper, String Destination){

        if(n==1){
            System.out.println("Transferring Disk " + n + " from " + Source + " to " + Destination);
            return;
        }
        towerOfHanoi(n-1, Source, Destination, Helper);
        System.out.println("Transferring Disk " + n + " from " + Source + " to " + Destination);
        towerOfHanoi(n-1, Helper, Source, Destination);
    }

    //Print a String in Reverse using Recursion
    public static void printReverse(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index)+ " ");
        printReverse(str, index-1);
    }

    //Find the First and Last Occurrence of an element in a String

    public static int firstIndex=-1;
    public static int lastIndex=-1;
    //Initialization if first and last index with an exclusive index value
    //Outside the method as index values are needed to be Constant and not to be created in eah stack height.

    public static void findOccurrence(String Str, int index, char element){
        if(index==Str.length()){
            System.out.println("The First Occurrence of the element is at " + firstIndex);
            System.out.println("The Last Occurrence of the element is at " + lastIndex);
            return;
        }
        char currentCharacter =Str.charAt(index);
        if(currentCharacter==element){
            if(firstIndex==-1){
                firstIndex=index;
            }else{
                lastIndex=index; //will be updated accordingly whenever occurrence of the element is found.
            }
        }
        findOccurrence(Str, index+1, element);
    }

    //Check if an array is sorted and strictly increasing using recursion

    public static boolean isSorted(int []arr, int index){
        if(index == arr.length-1){
            return true;
        }

        //Method 1
        if(arr[index] < arr [index+1]){
            return isSorted(arr, index+1);
        } else{
            return false;
        }
//        //Method 2
//        if(arr[index] >= arr[index+1]){
//            return false;
//        }else{
//            return isSorted(arr, index+1);
//        }
    }

    //Move all 'x' to the end of the String "axbcxxd"

    public static void changeString(String str, int index,int count, char element, String newString) {
        if(index==str.length()) {
            for(int i=0; i<count; i++) {
                newString += element;
            } //Updating the string with all x's in the end after counting them in loop
            System.out.println("The Updated String is : " + newString);
            return;
        }

        if(str.charAt(index)==element) {
            count++;
            changeString(str, index+1, count, element, newString);
        } //Counting number of x
        else{
            newString += str.charAt(index);
            changeString(str, index+1, count, element, newString);
        } //Updating the String when the current character is  not x

    }

    //Remove Duplicates in a String using Recursion
    ///Method 1
    public static void removeDuplicates1(StringBuilder str, int index, StringBuilder newString){
        if(index==str.length()-1){
            System.out.println("The Updated String is: " + newString);
            return;
        }
        char currentCharacter=str.charAt(index);
        for(int i=0; i<=str.length()-1; i++){
            if(currentCharacter==str.charAt(i) && index!=i){
                newString=str.delete(i, i+1);
                removeDuplicates1(str, index+1, newString);
            }
        }
    }
    ///Method 2
    public static boolean[] alphabets=new boolean[26]; //Since there are 26 alphabets. 'a' mapped as 0, 'b' as 1 ... 'z' as 26.

    public static void removeDuplicates2(String str, int index, String newString){
        if(index==str.length()){
            System.out.println("The Updates String is : " + newString);
            return;
        }
        char currentCharacter=str.charAt(index);
        if(alphabets[currentCharacter-'a']){
            removeDuplicates2(str, index+1 , newString); //since index of 'a' is 0 it is used to map other alphabets.
        } else{
            newString+=currentCharacter;
            alphabets[currentCharacter-'a']=true; //boolean value primarily initialized as false.
            removeDuplicates2(str, index+1, newString);
        }
    }

    //Print all subsequences of a String
    public static void Subsequences(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentCharacter=str.charAt(index);
        //Letter to be included
        Subsequences(str, index+1, newString+currentCharacter);
        //Letter not to be included
        Subsequences(str, index+1, newString);
    }

    //Print all unique subsequences of a String
    public static void uniqueSubsequences(String str, int index, String newString, HashSet<String> set){

        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currentCharacter=str.charAt(index);

        //Letter to be included
        uniqueSubsequences(str, index+1, newString+currentCharacter, set);

        //Letter not to be included
        uniqueSubsequences(str, index+1, newString, set);
    }

    //Print Keypad Combination
    public static String [] Keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void keypadCombination(String str, int index, String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currentCharacter=str.charAt(index);
        String map=Keypad[currentCharacter-'0'];//currentCharacter can be from 0-9 as keypad has 0-9 numbers
        for(int i=0; i<map.length(); i++){
            keypadCombination(str, index+1, combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        
//        int n=3;
//        towerOfHanoi(n, "Source", "Helper" , "Destination");

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str=sc.nextLine();
//        printReverse(str, str.length()-1);

//        findOccurrence("abaacdaefaah", 0, 'a');

//        int []arr={1, 2, 3, 4};
//        boolean result = isSorted(arr, 0);
//        if(result == true){
//            System.out.println("The array is sorted and Strictly increasing.");
//        } else{
//            System.out.println("The array is not sorted");

//        changeString("axbcxxxd", 0,0, 'x',  "");

//        StringBuilder str= new StringBuilder("abbccda");
//        StringBuilder newString = new StringBuilder(" ");
//        removeDuplicates1(str, 0, newString);

//        removeDuplicates2("abbccda", 0, " ");

//        Subsequences("abc", 0, " ");
//
//        HashSet<String> set=new HashSet<>();
//        System.out.println("The Unique Subsequences are: ");
//        uniqueSubsequences("aaa", 0, " ", set);

        keypadCombination("23", 0, "");
        }

    }


