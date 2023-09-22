package com.company;

public class CWH_35_ps_methods
{

    static void multiplication_table(int n)
    {
        for(int i = 1; i < 11; i++)
        {
            System.out.printf("%d X %d = %d\n", n, i , n * i);
        }
    }

    static void pattern(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    static void rec_pattern(int n)
    {
        if(n > 0)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print("* ");
            }
            System.out.printf("\n");
            rec_pattern(n-1);
        }
    }

    static int recursive_sum(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return (n + recursive_sum(n-1));
        }
    }

    static int itera_sum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }

    static void pattern2(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    static void rec_pattern2(int n)
    {
        if(n > 0)
        {
            rec_pattern2(n-1);
            for(int i = 0; i < n; i++)
            {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    static int fibonacci (int n)
    {
        // if (n == 1)
        // {
        //     return 0;
        // }
        // else if (n == 2)
        // {
        //     return 1;
        // }
        if(n == 1 || n == 2)
        {
            return n-1;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static float argu_avg(int n, int n1)
    {
        return (n + n1) / 2.0F;
    }
    static float argu_avg(int n, int n1, int n2)
    {
        return (n + n1 + n2) / 3.0F;
    }

    static float convert(float celcius)
    {
        return (celcius * (9/5.0F)) + 32;
    }

    public static void main(String[] args)
    {
        // Q1. write a java program to print multiplication table of a number n
        // multiplication_table(5);

        // Q2. write a java program to print the following pattern
        // *
        // * *
        // * * *
        // * * * *

        // pattern(4);

        // Q3. write a recursive function to calculate sum of first n natural numbers
        
        // System.out.println(recursive_sum(4));

        // Q4. write a java program to print the following pattern
        // * * * *
        // * * *
        // * *
        // *
        // pattern2(4);

        // Q5. write a function to print nth term of fibonacci series using recursion.
        // fibonacci series: 0 1 1 2 3 5 8 13 21 34
        // System.out.println(fibonacci(5));

        // Q6. write a function to find average of a set of numbers passed as arguments
        // System.out.println(argu_avg(1, 45, 2));
        
        // Q7. repeate 4 using recursion
        // rec_pattern2(4);

        // Q8. repeate 2 using recursion
        // rec_pattern(4);

        // Q9. write a function to convert celcius to farenheit
        // System.out.println(convert(26.9F));

        // Q10. repeate Q3 using iterative approach
        System.out.println(itera_sum(5));
    }
}
