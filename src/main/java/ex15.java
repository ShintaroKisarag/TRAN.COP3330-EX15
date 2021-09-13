/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Objects;
import java.util.Scanner;


public class ex15 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = input.nextLine(); //stores input
        String correctPassword = "abc$123"; //initializes correct password
        if(Objects.equals(password, correctPassword)){  //if user input equals the correct password
            System.out.println("Welcome!");
        }else{//if user input does not equal correct password
            System.out.println("I don't know you.");
        }
    }
}
