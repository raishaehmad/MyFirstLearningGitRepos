package com.company;

public class CWH_32_method_overloading
{
    static void tellJoke()
    {
        System.out.println("I Invented a New World \n Sci-Fi");
    }

    static void change(int a)
    {
        a = 98;
    }

    static void change_arr(int [] a)
    {
        a[0] = 4;
    }

    static void foo()
    {
        System.out.println("Good day");
    }

    static void foo(int a)
    {
        System.out.println("Good day " + a);
    }

    public static void main(String[] args)
    {
        // tellJoke();
        int [] marks = {19, 21, 43, 54, 73};

        // int y = 45;
        // System.out.println("The value of y after calling method " + y);
        change_arr(marks);
        System.out.println(marks[0]);

        foo();
        foo(3);

    }
}
