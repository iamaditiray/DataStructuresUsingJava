package com.aditi;
class details{
    private String userID;
    private String Password = "Aditi1234";

    //Getters and Setters to access user id
    public String getuserID(){
        return this.userID;
    }
    public void setuserID(String userID){
        this.userID=userID;
    }

    //Getters and Setters to access Password
    //Here the setPassword function is kept private and is accessed by getPassword to assign a random password itself
    //Inspite of taking user input. Thus, Data Encapsulation helps to hide data using the concept of Data Hiding

    public String getPassword(){
        setPassword(Password);
        return this.Password;
    }

    private void setPassword(String password){
        this.Password=Password;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        details a=new details();
        System.out.println(a.getPassword());
    }
}
