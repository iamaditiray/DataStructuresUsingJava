package com.aditi;
import java.util.*;

//Strings
public class Strings {
    public static void main(String[] args) {
        //Declaration
        String a="Aditi";
        String b="Ray";

        //Taking Input
        Scanner sc=new Scanner(System.in);
        String FirstName=sc.nextLine();
        String LastName=sc.nextLine();

        //Concatenation
        String fullName=FirstName+ " " +LastName;
        System.out.println(fullName);

        //length()
        System.out.println(fullName.length());

        //charAt(i)
        for(int  i=0; i<fullName.length(); i++ ){
            System.out.println(fullName.charAt(i));
        }

        //compareTo()
        String c="Dditi";
        String d="Dditi";
        String e="Editi";
        String f="Fditi";

        if(c.compareTo(d)==0){
            System.out.println("Strings are Equal ");
            System.out.println(c.compareTo(d));
        }else{
            System.out.println(c.compareTo(d));
        }

        System.out.println(e.compareTo(f)); //-1 since E-F=-1
        System.out.println(f.compareTo(d)); //+2 since F=D=2


        //SubStrings
        String sentence="I am Aditi Ray";
        String firstName=sentence.substring(5,11);
        String fullName1=sentence.substring(5, sentence.length());
        String lastName1=sentence.substring(11,13);
        String lastName2=sentence.substring(11);

        System.out.println(firstName); //Aditi
        System.out.println(fullName1); //Aditi Ray
        System.out.println(lastName1); //Ra
        System.out.println(lastName2); //Ray


        //Parsing to Integer Class
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number+123);

        //Parsing to String Class
        int num=123;
        String strings=Integer.toString(num);
        System.out.println(strings.substring(1));
    }
}

