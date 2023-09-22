package com.company;

public class CWH_34_fibonacci
{
    static int fibonacci(int n)
    {
        // 0 1 1 2 3 5 8 13 21 .....
        // fib(n) = fib(n-1) + fib(n-2)
        if (n == 0)
        {
            System.out.printf("0  ");
        }
        else if (n == 1 || n == 2)
        {
            System.out.printf("1 ");
        }
        else
        {
            System.out.printf("%d ", (fibonacci(n -1) + fibonacci(n-2)));
        }
        
        return n;
    }

    public static void main(String[] args)
    {
        fibonacci(5);
    }    
}
