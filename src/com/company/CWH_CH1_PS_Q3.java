package com.company;

import java.util.Scanner;

public class CWH_CH1_PS_Q3
{
    public static void main(String[] args)
    {
        // Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, Have a Good Day" txt.
        String name;
        Scanner take = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = take.nextLine();
        System.out.println("Hello " + name + ", Have a Good Day");
    }
}
