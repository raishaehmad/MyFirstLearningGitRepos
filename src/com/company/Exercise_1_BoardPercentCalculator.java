package com.company;

import java.util.Scanner;

public class Exercise_1_BoardPercentCalculator
{
    public static void main(String[] args)
    {
        int Sub_1;
        int Sub_2;
        int Sub_3;
        int Sub_4;
        int Sub_5;
        int total_Marks;
        float percentage;

        Scanner take = new Scanner(System.in);

        System.out.print("Enter Marks for Subject 1: ");
        Sub_1 = take.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        Sub_2 = take.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        Sub_3 = take.nextInt();

        System.out.print("Enter Marks for Subject 4: ");
        Sub_4 = take.nextInt();

        System.out.print("Enter Marks for Subject 5: ");
        Sub_5 = take.nextInt();

        total_Marks = Sub_1 + Sub_2 + Sub_3 + Sub_4 + Sub_5;
        percentage = (total_Marks * 100) / 500.0F;

        System.out.println("Student have 500 out of " + total_Marks + "Marks");
        System.out.println("Student Obtained " + percentage + "%");
    }
}

/*
* Write a Program to calculate percentage of a given student in CBSE Board exam His marks from 5 subject
* must be taken as input from the keyboard(Marks are out of 100)
*/
