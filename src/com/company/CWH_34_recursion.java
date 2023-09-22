package com.company;

public class CWH_34_recursion
{
    static int factorial(int n)
    {
        if(n == 0 || n ==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

    static int iterative_factorial(int n)
    {
        int sum = 1;
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                sum *= i;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Factorial of 5 is " + factorial(5));
        System.out.println("Factorial of 5 in iterative method is " + iterative_factorial(5));
    }
}
