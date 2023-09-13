package com.company;

import java.util.Scanner;

public class CWH_21_do_while_loop
{
    public static void main(String[] args)
    {
        // at least runs one time
        int i = 12;
        do {
            System.out.println(i);
            i++;
        }while (i < 10);

        // Quick Quiz
        Scanner take = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = take.nextInt();

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= n);
    }
}
