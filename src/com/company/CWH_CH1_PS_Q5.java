package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_CH1_PS_Q5
{
    public static void main(String[] args)
    {
        // Write a java program to detect whether a number entered by the user is integer or not
        int n;

        Scanner take = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        System.out.println(take.hasNextInt());
    }
}
