package com.company;

public class CWH_12_PS_Q1
{
    public static void main(String[] args)
    {
        // What is the result of following expression
        // float a = 7 / 4 * 9 / 2;
        float a = 7 / 4 * 9 / 2; // this gives ans 4.0 because int / int = int
        float b = 7 / 4.0F * 9 / 2.0F; // this gives ans 7.875
        System.out.println(a);
        System.out.println(b);
    }
}
