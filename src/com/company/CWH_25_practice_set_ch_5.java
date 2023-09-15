package com.company;

import java.util.Scanner;

public class CWH_25_practice_set_ch_5
{
    public static void main(String[] args)
    {
        // Q1. write a java program to print following patterns
        // * * * *
        // * * *
        // * *
        // *

        int n;
        Scanner take = new Scanner(System.in);
        System.out.print("Q1.Enter N: ");
        n = take.nextInt();

        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (j < (n - i))
                {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        // Q7. repeat Q1 using while loops
        System.out.print("Q7.Enter N: ");
        n = take.nextInt();
        int j = 0;
        int k = 0;
        while (j < n)
        {
            if(k <= (n - j))
            {
                System.out.println("* ");
                k++;
            }
            j++;
        }

        // Q2. write a java program to sum first an even numbers using while loop
        System.out.print("Q2.Enter N: ");
        n = take.nextInt();
        int z = 0;
        int sum = 0;

        while (z < n)
        {
            sum += (2 * z);
            z++;
        }
        System.out.println("Sum = " + sum);

        // Q11. repeat Q2 using for loops
        sum = 0;
        for(int y = 0; y < n; y++)
        {
            sum += (2 * y);
        }
        System.out.println("Q11. Sum = " + sum);

        // Q3. write a java program to print multiplication table of given number n
        System.out.print("Q3.Enter N: ");
        n = take.nextInt();

        for(int i = 1; i < 11; i++)
        {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

        // Q4. write a java program to print multiplication table of 10 in reverse order
        System.out.print("Q4.Enter N: ");
        n = take.nextInt();

        for(int i = 10; i > 0; i--)
        {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

        // Q5. write a java program to find factorial of a given number using for loops
        n = 5;
        int fac = 1;
        for (int i = 1; i <= n; i++)
        {
            fac *= i;
        }
        System.out.println("factorial " + fac);

        // Q6. repeat question 5 using while loops
        int i = 1;
        fac = 1;
        while (i <= n)
        {
            fac *= i;
            i++;
        }
        System.out.println("factorial " + fac);

        // Q9. write a java program to sum multiplication table of 8
        n = 8;
        sum = 0;
        for(i = 10; i > 0; i--)
        {
            sum += n * i;
        }
        System.out.println("Sum of 8 multiplication table " + sum);
    }
}
