package com.company;

import java.util.Scanner;

public class CWH_15_PS_Q1
{
    public static void main(String[] args)
    {
        // write a java program to convert string into lowercase
        String name;
        String lwr_name;

        Scanner take = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        name = take.nextLine();

        lwr_name = name.toLowerCase();
        System.out.println(lwr_name);
    }
}
