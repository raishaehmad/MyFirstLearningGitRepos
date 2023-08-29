package com.company;

public class CWH_15_PS_Q4
{
    public static void main(String[] args)
    {
        // write a java program to detect double or triple spaces in a String
        String str = "hello wo  rl    d";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
