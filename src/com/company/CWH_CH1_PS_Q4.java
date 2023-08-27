package com.company;

import java.util.Scanner;

public class CWH_CH1_PS_Q4
{
    public static void main(String[] args)
    {
        // write a java program to convert Kilometers to miles
        float kilometer;
        float miles;

        Scanner take = new Scanner(System.in);
        System.out.print("Enter Kilometers: ");
        kilometer = take.nextFloat();
        miles = kilometer * 0.621371F;
        System.out.println(kilometer + " Kilometer = " + miles + "Miles.");

    }
}
