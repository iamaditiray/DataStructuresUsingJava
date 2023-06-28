package com.aditi;
import java.util.*;

public class Backtracking {

    //Print all possible permutations of a String ( Time Complexity : O(n*n!) )
    public static void printPermutation(String str, int index, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currentCharacter=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermutation(newString, index+1, permutation+currentCharacter );
        }
    }

    //N-QUEENS Problem
    public static boolean isSafe(int row, int column, char[][]board){

        //This function Checks if the Queen is safe to place in a particular position or not
        //Horizontal Check
        for(int j=0; j<board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        //Horizontal Check
        for(int i=0; i<board[0].length; i++){
            if(board[i][column]=='Q'){
                return false;
            }
        }

        int r=row;
        //Upper Left Check
        for(int c=column; c>=0 && r>=0; c--, r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //Lower Left Check
        for(int c=column; c>=0 && r<board.length; c--, r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //Upper Right Check
        for(int c=column; c<board.length && r>=0; c++, r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //Lower Right Check
        for(int c=column; c<board.length && r<board.length; c++, r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true; //If every condition mentioned above is false that means there is no chance of the queen to be attacked.
    }

    public static void saveBoard(char [][]board, List<List<String>>allBoards){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static void helper(char[][] board, List<List<String>> allBoards, int column){
        if(column==board.length){
            saveBoard(board, allBoards); //When Column number ends board is saved.
            return;
        }
        //This is the helper method which will help us with Backtracking.
        //Number of column of which the queen is placed is referred as column
        for(int row=0; row<board.length; row++){
            if(isSafe(row, column, board)){
                //Each Column will contain one queen in the safe place where other queens cannot attack.
                board[row][column]='Q'; //If Queen is safe in a particular position storing the char 'Q' in that position
                helper(board, allBoards, column+1); //Placing Next Queen is next Column
            }
        }
    }
    public static List<List<String>> solveNQueens(int n){
        //This is a list of boards with solution combinations.
        // Each board again have combinations referring 'Q' as Queen and '.' as Empty Space
        //The combinations are represented row wise e.g. first row represented as ['.','Q','.','.']
        List<List<String>> allBoards= new ArrayList<>(); //List of List of Strings
        char[][] board = new char[n][n]; //Chessboard represented as 2D Character array of nxn size
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String[] args) {

//        printPermutation("ABC", 0, " ");

        solveNQueens(4);
    }
}
