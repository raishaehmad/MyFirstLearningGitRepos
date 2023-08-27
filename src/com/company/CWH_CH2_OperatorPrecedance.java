package com.company;

public class CWH_CH2_OperatorPrecedance
{
    public static void main(String[] args)
    {
        int a = 6 * 5 - 34 / 2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
        * 30 - 34 / 2
        * 30 - 17
        * 13
        * */
        int b = 60 / 5 - 34 * 2;
        /*
        * 12 - 34 * 2
        * 12 - 68
        * -56
        * */
        System.out.println(a);
        System.out.println(b);
        // Precedence and associativity

        //Quick Quiz

        //Q1.
        //int x = 6;
        //int y = 1;
        //int k = x * y / 2;
        //System.out.println(k); //Ans is = 3;

        // Q2.
        //int a;
        //int b;
        //a = 1;
        //b = 4;
        //int c = 5;
        //int k = b * b - (4 * a * c) / (2 * a);

        // Q3.
        //int a;
        //a = 5;
        //int v = 2;
        //int k = v * v * a * a;
        //System.out.println(k);

        // Q4.
        // a * b - d
        //a = 5;
        //b = 3;
        //int d = 10;
        //int k = a * b - d;
        //System.out.println(k);
    }
}
