package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CWH_19_PS {
    public static void main(String[] args) {
        // Q1. what will be the output of this program
        //int a = 10;
        //if(a = 11) // this will throw error we can't give int type it only boolean type
        //{
        //    System.out.println("I am 11");
        //}
        //else
        //{
        //    System.out.println("I am not 11");
        //}

        // Q2. write a program to find out whether a student is pass or fail
//        byte maths;
//        byte science;
//        byte chemistry;
//        int total_marks;
//        float percentage;
//        boolean isPass;
//
//        Scanner take = new Scanner(System.in);
//
//        System.out.print("Enter Marks for Maths: ");
//        maths = take.nextByte();
//
//        System.out.print("Enter Marks for Science: ");
//        science = take.nextByte();
//
//        System.out.print("Enter Marks for Chemistry: ");
//        chemistry = take.nextByte();
//
//        total_marks = maths + science + chemistry;
//        percentage = total_marks * 100 / 300.0F;
//
//        isPass = ((maths > 33) && (science > 33) && (chemistry > 33) && (percentage > 44));
//
//        if(isPass)
//        {
//            System.out.println("You are pass!\nCongratulations");
//            System.out.println("Percentage: " + percentage);
//            System.out.println("Total Marks: " + total_marks);
//        }
//        else
//        {
//            System.out.println("You Failed Study More");
//            System.out.println("Percentage: " + percentage);
//            System.out.println("Total Marks: " + total_marks);
//        }


        // Q3. calculate income tex paid by an employee to the government as per the slabs mantioned below:
        // Income Slab     Tax
        // 2.5L - 5.0L      5%
        // 5.0L - 10.0L     20%
        // above 10.0L      30%

//        float tax = 0;
//        float income;
//        Scanner take = new Scanner(System.in);
//        System.out.print("Enter Your Income: ");
//        income = take.nextFloat();
//
//        if(income < 250000)
//        {
//            tax = 0;
//        }
//        else if(income > 250000 && income <= 500000)
//        {
//            tax += 0.05F * (income - 250000);
//        }
//        else if (income > 500000 && income <= 1000000)
//        {
//            tax += 0.05F * (500000F - 250000F);
//            tax += 0.2F * (income - 500000.0F);
//        }
//        else if(income > 1000000)
//        {
//            tax += 0.05F * (500000F - 250000F);
//            tax += 0.2F * (1000000 - 500000.0F);
//            tax += 0.3F * (income - 250000);
//        }
//
//        System.out.println("You are Paying " + tax + " tax to the government.");


        // Q4. write a java program to find out the day of week given the number [1 for Monday 2 for tuesday.. and so on
        //byte day;
        //Scanner take = new Scanner(System.in);
        //System.out.print("Enter number btwn 1 to 7: ");
        //day = take.nextByte();

        //switch (day) {
        //    case 1 -> System.out.println("Monday!");
        //    case 2 -> System.out.println("Tuesday!");
        //    case 3 -> System.out.println("Wednesday!");
        //    case 4 -> System.out.println("Thursday!");
        //    case 5 -> System.out.println("Friday!");
        //    case 6 -> System.out.println("Saturday!");
        //    case 7 -> {
        //        System.out.println("Sunday!");
        //        System.out.println("Enjoy Week-End");
        //    }
        //    default -> System.out.println("Enter number between 1 to 7 next time");

        // Q5. write a java program to find whether a year entered by user is leap year or not
        //int year;
        //boolean hasLeapYear = false;
        //Scanner take = new Scanner(System.in);
        //System.out.print("Enter Year: ");
        //year = take.nextInt();

        //if(year % 4 == 0)
        //{
        //    if(year % 100 == 0)
        //    {
        //        if(year % 400 == 0)
        //        {
        //            hasLeapYear = true;
        //        }
        //    }
        //}

        //if(hasLeapYear)
        //{
        //    System.out.println("Year is Leap Year");
        //}
        //else
        //{
        //    System.out.println("Year is not Leap Year");
        //}

        // Q6. write a java program to find out the type of website from the url
        // .com     -> Commercial website
        // .org     -> organization website
        // .in      -> indian website

        String url;
        Scanner take = new Scanner(System.in);
        System.out.print("Enter URL of a website: ");
        url = take.next();

        if(url.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(url.endsWith(".org"))
        {
            System.out.println("Organization website");
        }
        else if(url.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Invalid URL!");
        }
    }
}
