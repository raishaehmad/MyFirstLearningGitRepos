package com.company;

import java.util.Scanner;

public class CWH_13_Strings
{
    public static void main(String[] args)
    {
        //String str = new String("Raish");
        String str = "Raish";
        System.out.print("The Name is: ");
        System.out.println(str);
        int a = 34;
        float f = 4.57F;
        double l = 3452.234;
        char c = 'a';

        System.out.printf("The Value of a is %d and f is %f", a, f);
        //System.out.printf("The Value of l is %lf and c is %c", l, c);
        // here in c %lf for double but in java different i cant found so commented it
        System.out.printf("The Name is %s", str);

        Scanner take = new Scanner(System.in);
        //String name = take.next(); // takes only one first word
        String name = take.nextLine();
        System.out.println(name);
    }
}
