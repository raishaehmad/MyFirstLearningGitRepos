package com.company;

public class CWH_24_break_n_continue
{
    public static void main(String[] args)
    {
        // break and continue using loops
        for(int i = 0; i < 6; i++)
        {
            System.out.println(i);
            System.out.println("Java Language");
            if(i == 2)
            {
                System.out.println("Ending loop using break");
                break;
            }
        }

        for(int i = 0; i < 6; i++)
        {
            if(i == 2)
            {
                System.out.println("Ending loop using break");
                continue;
            }
            System.out.println(i);
            System.out.println("Java Language");
        }

        // break and continue works in all loops
    }
}
