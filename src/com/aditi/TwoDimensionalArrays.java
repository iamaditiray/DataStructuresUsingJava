package com.aditi;
import java.util.Scanner;
//2D Arrays
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int columns =sc.nextInt();

        int [][] matrix=new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter Element of Index " + i + " , " + j + ": ");
                matrix[i][j]=sc.nextInt();
            }
        }


        //2-D Array Matrix Representation
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        //Finding an Element
        System.out.print("Which Element do you want to find? ");
        int element=sc.nextInt();
        int counter=1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j]==element){
                    System.out.println("The index of the element " + element + " is found at: (" + i + "," + j + ")");
                    counter++;
                    break;
                }
            }
        } if(counter==1){
            System.out.println("Element not present. ");
        }
    }
}
