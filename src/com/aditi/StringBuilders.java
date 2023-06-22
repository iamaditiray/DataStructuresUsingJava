package com.aditi;

public class StringBuilders {
    public static void main(String[] args) {

        //Declaration
        StringBuilder Name=new StringBuilder("A");
//
        //Append()
        Name.append("d");
        Name.append("i");
        Name.append("t");
        Name.append("s");
        Name.append(" ");
        Name.append("R");
        Name.append("a");
        Name.append("y");
//
        System.out.println(Name); //Adits Ray

        //charAt()
        System.out.println(Name.charAt(0)); //A

        //setCharAt()
        Name.setCharAt(4, 'i');
        System.out.println(Name); //Aditi Ray

        //Insertion
        System.out.println(Name.insert(0,'i')); //iAditi

        //Deletion
        System.out.println(Name.delete(6,Name.length())); //Aditi

        //Length()
        System.out.println(Name.length()); //6


        StringBuilder Name1=new StringBuilder("Aditi Ray");
        //Reversing a String (Method 1)
        for(int i=(Name1.length()-1); i>=0; i--){
            System.out.println(Name1.charAt(i));
        }

        //Reversing a String(Method 2)
        for(int i=0; i<Name1.length()/2; i++){
            int frontIndex=i;
            int backIndex=Name1.length()-1-i;

            char frontChar=Name1.charAt(frontIndex);
            char backChar=Name1.charAt(backIndex);

            Name1.setCharAt(frontIndex, backChar);
            Name1.setCharAt(backIndex, frontChar);
        }

        System.out.println(Name1); //yaR itidA
    }
}
