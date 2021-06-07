/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.util.Scanner;

public class passwordValid {
    public static void main(String[] args) {
        String password ="abc$123";
        String key ="";
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the password");
        key = scan.nextLine();
        if(password.equals(key))
        {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you");
        }
    }
}
