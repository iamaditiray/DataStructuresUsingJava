package com.aditi;
import java.util.*;

public class Recursion3 {

    //Print all permutations of a String
    public static void printPermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currentCharacter = str.charAt(i);
            String newString=str.substring(0,i) + str.substring(i+1);
            printPermutation(newString, permutation+currentCharacter);
        }
    }

    //Count total paths in a Maze to move from (0,0) to (n,m) Let n=3, m=3
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        ///Downward Movement
       int downPaths=countPaths(i+1, j, n, m);

        ///Right Movement
       int rightPaths=countPaths(i, j+1, n, m);

        int totalPaths=downPaths+rightPaths;
        return totalPaths;
    }

    //Place Tiles of size 1xm in a floor of size nxm
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //Placing Tiles Vertically
        int verticalPlacement=placeTiles((n-m), m);

        //Placing Tiles Horizontally
        int horizontalPlacement=placeTiles((n-1),m);

        int totalWays=verticalPlacement+horizontalPlacement;
        return totalWays;
    }

    //Find the number of ways in which you can invite n people to your party, single or in pairs.
    public static int inviteGuests(int n){
        if(n<=1){
            return 1;
        }
        //For single Guest
        int singleGuest=inviteGuests(n-1); //Selection of 1 single guest leaves choice for (n-1) guests

        //For Pairs
        int pairedGuests=(n-1)*inviteGuests(n-2); //Selection of 1 pair of guests leaves choice for (n-2) guests and a choice for partner of 1 guest from (n-1) guests

        int totalWays=singleGuest+pairedGuests;

        return totalWays;
    }

    //Print all Subsets of n Natural Numbers
    public static void printSets(ArrayList<Integer> set){
        for(int i=0; i<set.size();i++){
            System.out.print(set.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            printSets(subset);
            return;
        }

        //Number to be included
        subset.add(n);
        findSubset(n-1, subset);

        //Number not be included
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);

    }
    public static void main(String[] args) {
//        printPermutation("abc", "");

//        int n=3;
//        int m=3;
//        System.out.println(countPaths(0,0,n,m));

//        System.out.println("Total Number of ways are: ");
//        System.out.println(placeTiles(4,2));

//        int n=3;
//        System.out.println("Total Number of ways to invite " + n + " guests singly or in pair is " + inviteGuests(n));

        int n=3;
        ArrayList<Integer> subset =new ArrayList<>();
        findSubset(n,subset);
    }
}
