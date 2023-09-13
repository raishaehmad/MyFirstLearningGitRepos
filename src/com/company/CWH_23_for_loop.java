package com.company;

import java.util.Scanner;

public class CWH_23_for_loop
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        // Quick Quiz : write a program to print first n odd numbers
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            System.out.println(2 * i + 1);
        }

        // Decrementing for loop
        for(int i = 3; i > 0; i--)
        {
            System.out.println(i);
        }

        // write a program to print first n natural numbers in reverse order
        Scanner take = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = take.nextInt();
        for(int i = n; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
