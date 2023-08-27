package com.company;

public class CWH_10_Resulting_data_type
{
    public static void main(String[] args)
    {
        byte x = 4;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54F + x;
        System.out.println(b);

        // Increment And Decrement Operators
        int i = 43;
        // int b = i++; // First i is assigned to b then incremented value by 1 // result b = 43
        int j = 54;
        // int c = ++j // First j is incremented value by 1 then assigned to c // result j = 55
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}

/*
* Quick Quiz:
* int y = 7;
* int x = ++y * 8;
* value of x is 64
*
* char c = 'A'; then
* System.our.println(++c);
* give c = 'B' output
* */
