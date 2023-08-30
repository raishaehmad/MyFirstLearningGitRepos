package com.company;

public class CWH_17_Logical_Operator
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = true;

        System.out.println("For And(&&)");
        if(a && b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        System.out.println("For Or (||)");
        if(a || b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        System.out.println("For Not(!)");
        if(a != b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
